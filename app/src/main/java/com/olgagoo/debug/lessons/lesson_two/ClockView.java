package com.olgagoo.debug.lessons.lesson_two;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.Calendar;

public class ClockView extends View{
    private MyClickListener myClickListener;

    public ClockView(Context context) {
        super(context);
    }

    public ClockView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ClockView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Deprecated()
    public ClockView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint pen = new Paint();
        Paint rectPaint = new Paint();
        float radius = Math.min(getWidth(),getHeight()/2);

        pen.setColor(Color.GREEN);
        pen.setColor(Color.RED);

        canvas.drawCircle(
                getWidth()/2,
                getHeight(),
                radius,
                pen);
        float yEdge = getHeight()/2 - radius;
        float xLine = getWidth()/2;
        float yStartLine = yEdge * 0.9F;
        float yEndLine = yEdge * 1.1F;

        canvas.save();

        for(int i =0; i<11; i++){

            canvas.rotate(30,getWidth()/2, getHeight()/2);
            canvas.drawLine(xLine,yStartLine,xLine,yEndLine,rectPaint);
        }
        canvas.restore();

        Calendar calendar = Calendar.getInstance();
        float hour = calendar.get(Calendar.HOUR);
        float min = calendar.get(Calendar.MINUTE);
        canvas.save();
        canvas.rotate(hour* 30+ 30/60 *min, getWidth()/2, getHeight()/2);
        canvas.drawLine(xLine,getHeight()/2,xLine,getHeight()-radius/2, rectPaint);

    }

    //catches the click listener
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    interface MyClickListener{
        void onClick();
    }

    public void setMyClickListener(MyClickListener myClickListener) {
        this.myClickListener = myClickListener;
    }
}
