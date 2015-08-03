package com.fxft.cheyoufuwu.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.fxft.cheyoufuwu.R;

/**
 * 可以左右滑动的开关按钮
 * Created by ChenDJ on 2015/7/30.<br>
 */
public class ToggleButton extends View implements View.OnTouchListener {

    private static final String TAG = ToggleButton.class.getSimpleName();

    //设置默认的样式
    private final int DEFUALT_WIDTH = 250;
    private final int DEFUALT_HEIGHT = 70;

    private final int PADDING = 15; //默认的按钮距离控件左边的距离

    private int mPadding;

    private final int DEFUALT_BUTTON_WIDTH = 120;
    private final int DEFUALT_BUTTON_Heigh = 50;


    private int width;
    private int height;

    public static final int ON = 0x1;
    public static final int OFF = 0x0;

    private int mState = OFF;   //默认为关闭状态

    //按钮向右滑动的最大距离

    private boolean onTouch;
    private float currentX;

    private Paint paint = new Paint();
    private int mLastState;
    private OnToggleStateChangeListener mStateListener;

    private Paint buttonPaint = new Paint();
    private Bitmap mBtBitmap;
    private Bitmap mOffStateBitmap;
    private Bitmap mOnStateBitmap;

    public interface OnToggleStateChangeListener {
        void onChange(int state);
    }

    public void setOnToggleStateChangeListener(OnToggleStateChangeListener listener) {
        this.mStateListener = listener;
    }

    public ToggleButton(Context context) {
        this(context, null);
    }

    public ToggleButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
        initEvent();
    }

    private void initEvent() {
        this.setOnTouchListener(this);
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ToggleButton);
        mOffStateBitmap = BitmapFactory.decodeResource(getResources(), a.getResourceId(R.styleable.ToggleButton_off_bg, Integer.MIN_VALUE));
        mOnStateBitmap = BitmapFactory.decodeResource(getResources(), a.getResourceId(R.styleable.ToggleButton_on_bg, Integer.MIN_VALUE));
        mBtBitmap = BitmapFactory.decodeResource(getResources(), a.getResourceId(R.styleable.ToggleButton_button_bg, Integer.MIN_VALUE));

        mPadding = a.getDimensionPixelSize(R.styleable.ToggleButton_button_margin, Integer.MIN_VALUE);
        if (mPadding < 0) {
            mPadding = PADDING;
        }
        buttonPaint.setColor(Color.WHITE);
        a.recycle();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heighSize = MeasureSpec.getSize(heightMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);

        if (widthMode == MeasureSpec.AT_MOST || widthMode == MeasureSpec.UNSPECIFIED) {
            if (mOnStateBitmap == null || mOffStateBitmap == null) {
                widthSize = DEFUALT_WIDTH;
            } else {
                widthSize = mOnStateBitmap == null ? mOffStateBitmap == null ? DEFUALT_HEIGHT : mOffStateBitmap.getWidth()
                        : mOnStateBitmap.getWidth();
            }
        }
        if (heightMode == MeasureSpec.AT_MOST || heightMode == MeasureSpec.UNSPECIFIED) {
            if (mOnStateBitmap == null || mOffStateBitmap == null) {
                heighSize = DEFUALT_HEIGHT;
            } else {
                heighSize = mOnStateBitmap == null ? mOffStateBitmap == null ? DEFUALT_HEIGHT : mOffStateBitmap.getHeight()
                        : mOnStateBitmap.getHeight();
            }
        }
        width = widthSize;
        height = heighSize;
        setMeasuredDimension(widthSize, heighSize);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (mBtBitmap == null || mOnStateBitmap == null || mOffStateBitmap == null) {
            drawDefualtToggleButton(canvas);
        } else {
            drawCustomToggleButton(canvas);
        }
    }

    private void drawCustomToggleButton(Canvas canvas) {
        float x = currentX ;
        if (onTouch) {
            //如果触摸状态就移动滑块
            if (x + (mBtBitmap.getWidth() / 2) >= mOffStateBitmap.getWidth() - mPadding) {
                x = mOffStateBitmap.getWidth() - mPadding - mBtBitmap.getWidth() / 2;
            } else if (x <= mBtBitmap.getWidth() / 2 + mPadding) {
                x = mBtBitmap.getWidth() / 2 + mPadding;
            }
        } else {
            //不是触摸状态，要根据滑块的位置来判断滑块是自己滑动好左边还是右边
            //1，先判断开关状态
            if (mState == ON) {
                x = mOffStateBitmap.getWidth() - mPadding - mBtBitmap.getWidth() / 2;
            } else {
                x = mBtBitmap.getWidth() / 2 + mPadding;
            }
        }
        if (x > mOnStateBitmap.getWidth() / 2) {
            //设置背景为打开背景
            canvas.drawBitmap(mOnStateBitmap, 0, 0, new Paint());
        } else {
            //设置背景为关背景
            canvas.drawBitmap(mOffStateBitmap, 0, 0, new Paint());
        }

        canvas.drawBitmap(mBtBitmap, x - mBtBitmap.getWidth() / 2  ,
                (mOnStateBitmap.getHeight() - mBtBitmap.getHeight()) / 2, new Paint());
    }

    private void drawDefualtToggleButton(Canvas canvas) {
        //滑动的距离加上按钮的一般长度，就是按钮的中线x值
        float x = currentX;
        if (onTouch) {
            if (x + (DEFUALT_BUTTON_WIDTH / 2) >= DEFUALT_WIDTH - mPadding) {
                x = DEFUALT_WIDTH - mPadding - DEFUALT_BUTTON_WIDTH / 2;
            } else if (x <= mPadding + DEFUALT_BUTTON_WIDTH / 2) {
                x = DEFUALT_BUTTON_WIDTH / 2 + mPadding;
            }
        } else {
            if (mState == ON) {
                x = DEFUALT_WIDTH - mPadding - DEFUALT_BUTTON_WIDTH / 2;
            } else {
                x = DEFUALT_BUTTON_WIDTH / 2 + mPadding;
            }
        }

        if (x > DEFUALT_WIDTH / 2) {
            Paint green = new Paint();
            green.setColor(Color.GREEN);
            canvas.drawRect(new RectF(0, 0, DEFUALT_WIDTH, DEFUALT_HEIGHT), green);
        } else {
            Paint red = new Paint();
            red.setColor(Color.RED);
            canvas.drawRect(new RectF(0, 0, DEFUALT_WIDTH, DEFUALT_HEIGHT), red);
        }

        canvas.drawRect(new RectF(x - DEFUALT_BUTTON_WIDTH / 2, (DEFUALT_HEIGHT - DEFUALT_BUTTON_Heigh) / 2, x + DEFUALT_BUTTON_WIDTH / 2,
                DEFUALT_HEIGHT - (DEFUALT_HEIGHT - DEFUALT_BUTTON_Heigh) / 2), buttonPaint);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int action = event.getAction();
        int width;
        if (mOnStateBitmap == null) {
            width = DEFUALT_WIDTH;
        } else {
            width = mOnStateBitmap.getWidth();
        }
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                currentX = event.getX();
                onTouch = true;
                break;
            case MotionEvent.ACTION_MOVE:
                //按下和移动都需要将按钮移动至手指触摸的位置
                onTouch = true;
                currentX = event.getX();
                if (currentX > width / 2) {
                    //开
                    mState = ON;
                } else {
                    //关
                    mState = OFF;
                }
                break;
            case MotionEvent.ACTION_UP:
                //手指离开
                //根据位置自动滑动到最左边或者最右边
                onTouch = false;
                if (currentX > width / 2) {
                    //开
                    mState = ON;
                } else {
                    //关
                    mState = OFF;
                }
                //如果上一次的状态和当前的开关状态不同，那么就回调
                if (mLastState != mState) {
                    if (mStateListener != null) {
                        Log.i(TAG, "开关变化");
                        mStateListener.onChange(mState);
                    }
                }
                //记录上一次的按钮最后操作
                mLastState = mState;
                break;
        }
        invalidate();   //重画控件
        return true;
    }
}
