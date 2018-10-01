package com.olgagoo.debug.lessons.lesson_four;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

import com.olgagoo.debug.lessons.BuildConfig;
import com.olgagoo.debug.lessons.R;

public class CustomControl extends View {
    public CustomControl(Context context) {
        super(context);
    }

    public CustomControl(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomControl(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomControl(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint pen = new Paint();

        pen.setColor(Color.GREEN);
        canvas.drawCircle(
                getWidth()/2,
                getHeight()/2,
                Math.min(getWidth()/2, getHeight()/2),
                pen);

    }




}
