package com.fxft.cheyoufuwu.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.fxft.cheyoufuwu.R;

/**
 * 横向的冬天更新进度条带有刻度
 * Created by ChenDJ on 2015/7/31.<br>
 */
public class LineProcessView extends View {

    private int mMaxValue;
    private int mCurrentValue;
    private int mTextPadding;
    private int mTextSize;

    private static final int DEFUALT_LINE_HEIGHT = 5;

    private static final int DEFUALT_SCALE = 4;

    private static final int DEFUALT_TEXT_PADDING = 50;

    private static final int TEXT_SIZE = 20;

    private Paint bg_Paint = new Paint();
    private Paint light_Paint = new Paint();
    private Paint textNormalColorPaint = new Paint();
    private Paint textLightColorPaint = new Paint();

    private int mBgColor;
    private int mLightColor;
    private int mMinValue;
    private float lightWidth;
    private int mCurrentTotalGrowValue;

    public LineProcessView(Context context) {
        this(context, null);
    }

    public LineProcessView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
        bg_Paint = new Paint();
        bg_Paint.setColor(mBgColor);

        light_Paint = new Paint();
        light_Paint.setColor(mLightColor);

        textNormalColorPaint.setColor(mBgColor);
        textNormalColorPaint.setTextSize(mTextSize);
        textLightColorPaint.setColor(mLightColor);
        textLightColorPaint.setTextSize(mTextSize);

    }

    public int getMaxValue() {
        return this.mMaxValue;
    }

    public int getCurrentMinValue(){
        return this.mMinValue;
    }

    public int getCurrentTotalValue() {
        return this.mCurrentTotalGrowValue;
    }

    public void setCurrentTotalValue(int value) {
        this.mCurrentTotalGrowValue = value;
    }

    public void setMaxValue(int maxValue) {
        this.mMaxValue = maxValue;
    }

    public void setMinValue(int baseGrowValue) {
        this.mMinValue = baseGrowValue;
    }

    public void setProcessValue(int value) {
        this.mCurrentValue = value;
        lightWidth = (float) (mCurrentValue - mMinValue) / (mMaxValue - mMinValue) * getMeasuredWidth();
        invalidate();
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.LineProcessView);
        mMaxValue = a.getInt(R.styleable.LineProcessView_process_max_value, 300);
        mCurrentValue = a.getInt(R.styleable.LineProcessView_process_value, 100);
        mMinValue = a.getInt(R.styleable.LineProcessView_process_base_value, 100);
        mTextPadding = a.getDimensionPixelSize(R.styleable.LineProcessView_text_padding, DEFUALT_TEXT_PADDING);
        mTextSize = a.getDimensionPixelSize(R.styleable.LineProcessView_text_size, TEXT_SIZE);
        mBgColor = a.getColor(R.styleable.LineProcessView_process_bg_color, Color.LTGRAY);
        mLightColor = a.getColor(R.styleable.LineProcessView_process_light_color, Color.RED);
        a.recycle();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        if (heightMode == MeasureSpec.AT_MOST
                || heightMode == MeasureSpec.UNSPECIFIED) {
            int height = DEFUALT_LINE_HEIGHT * 2 + DEFUALT_TEXT_PADDING + mTextSize;
            heightMeasureSpec = MeasureSpec.makeMeasureSpec(height, heightMode);
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //分三个刻度，每个刻度需要画出一个点，点下面还有刻度值
        float x = getMeasuredWidth() / DEFUALT_SCALE;
        canvas.drawRect(0, 0, getMeasuredWidth(), DEFUALT_LINE_HEIGHT, bg_Paint);

        //画出进度
        canvas.drawRect(0, 0, lightWidth, DEFUALT_LINE_HEIGHT, light_Paint);

        //画出三个刻度
        Paint scalePaint;
        Paint textPaint;
        for (int i = 0; i < DEFUALT_SCALE; i++) {
            if (i == DEFUALT_SCALE - 1)
                break;
            float left = x * (i + 1);
            if (lightWidth >= left) {
                scalePaint = light_Paint;
                textPaint = textLightColorPaint;
            } else {
                scalePaint = bg_Paint;
                textPaint = textNormalColorPaint;
            }
            canvas.drawRect(left, DEFUALT_LINE_HEIGHT, left + DEFUALT_LINE_HEIGHT, DEFUALT_LINE_HEIGHT * 2, scalePaint);
            //画出刻度下面的文字
            String value = String.valueOf(((mMaxValue - mMinValue) / (DEFUALT_SCALE)) * (i + 1) + mMinValue);
            float textWidth = textNormalColorPaint.measureText(value);
            canvas.drawText(value, left - textWidth / 2, DEFUALT_LINE_HEIGHT * 2 + DEFUALT_TEXT_PADDING, textPaint);
        }
    }
}
