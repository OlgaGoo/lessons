package com.olgagoo.debug.lessons.lesson_two;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

import com.olgagoo.debug.lessons.R;
import com.olgagoo.debug.lessons.lesson_five.LessonFiveActivity;
import com.olgagoo.debug.lessons.lesson_one.LessonOneActivity;
import com.olgagoo.debug.lessons.lesson_seven.LessonSevenActivity;
import com.olgagoo.debug.lessons.lesson_six.ActivitySix;

public class MenuActivity extends Activity {
    Button lsOne;
    Button lsTwo;
    Button lsSix;
    Button lsSeven;
    View.OnClickListener lsOneClk;
    View.OnClickListener lsTwoClk;
    View.OnClickListener lsTwoSix;
    View.OnClickListener lsSevenCLk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        lsOne = (Button) findViewById(R.id.menu_btn1);
        lsTwo = (Button) findViewById(R.id.menu_btn2);
        lsSix = (Button) findViewById(R.id.menu_btn3);
        lsSeven = (Button) findViewById(R.id.menu_btn4);

        final Intent lessonOneActivity = new Intent(this,LessonOneActivity.class);
        final Intent lessonFiveActivity = new Intent(this,LessonFiveActivity.class);
        final Intent lessonSixActivity = new Intent(this, ActivitySix.class);
        final Intent lessonSevenActivity = new Intent(this, LessonSevenActivity.class);


        lsOneClk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(lessonOneActivity);
            }
        };

        lsTwoClk = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(lessonFiveActivity);
            }
        };

        lsTwoSix = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(lessonSixActivity);
            }
        };

        lsSevenCLk = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(lessonSevenActivity);
            }
        };

        lsOne.setOnClickListener(lsOneClk);
        lsTwo.setOnClickListener(lsTwoClk);
        lsSix.setOnClickListener(lsTwoSix);
        lsSeven.setOnClickListener(lsSevenCLk);

    }

}
