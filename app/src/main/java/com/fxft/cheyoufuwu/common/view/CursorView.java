package com.fxft.cheyoufuwu.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import com.fxft.cheyoufuwu.R;
import com.nineoldandroids.view.ViewHelper;

public class CursorView extends View {
    private static final String TAG = CursorView.class.getSimpleName();

    private static final int DEFUALT_PADDING = 0;

    private int mCursorCount;
    private int mCursorColor;

    private Paint paint;
    private int mCursorPadding;

    public CursorView(Context context) {
        super(context);
        init(context, null, 0);
    }

    public CursorView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public CursorView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CursorView, defStyleAttr, 0);
        mCursorColor = a.getColor(R.styleable.CursorView_cursor_color, Color.BLUE);
        mCursorPadding = a.getDimensionPixelSize(R.styleable.CursorView_cursor_horizontal_padding, DEFUALT_PADDING);
        mCursorCount = a.getInt(R.styleable.CursorView_cursor_count, 2);
        a.recycle();

        paint = new Paint();
        paint.setColor(mCursorColor);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int heigthMode = MeasureSpec.getMode(heightMeasureSpec);

        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heigthSize = MeasureSpec.getSize(heightMeasureSpec);

        int selfWidth = 0;

        if ((widthMode == MeasureSpec.AT_MOST || widthMode == MeasureSpec.UNSPECIFIED)
                || (heigthMode == MeasureSpec.AT_MOST || heigthMode == MeasureSpec.UNSPECIFIED)) {
            //自己进行计算
            selfWidth = widthSize / mCursorCount;
        }
        int finalWidth = (widthMode == MeasureSpec.AT_MOST || widthMode == MeasureSpec.UNSPECIFIED) ? selfWidth : widthSize;
        setMeasuredDimension(finalWidth, heigthSize);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(new RectF(0 + mCursorPadding, 0, getMeasuredWidth() - mCursorPadding, getMeasuredHeight()), paint);

    }

    public void setTranslateX(float translateX) {
        ViewHelper.setTranslationX(this, translateX);
    }

}
