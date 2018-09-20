package com.olgagoo.debug.lessons.lesson_two;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

import com.olgagoo.debug.lessons.R;
import com.olgagoo.debug.lessons.lesson_one.LessonOneActivity;

public class LessonTwoActivity extends Activity {
    Button lsOne;
    View.OnClickListener lsOneClk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_two);

        lsOne = (Button) findViewById(R.id.menu_btn1);

        final Intent lessonOneActivity = new Intent(this,LessonOneActivity.class);


        lsOneClk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(lessonOneActivity);
            }
        };

        lsOne.setOnClickListener(lsOneClk);

    }

}
