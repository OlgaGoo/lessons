package com.olgagoo.debug.lessons.lesson_two;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

import com.olgagoo.debug.lessons.R;
import com.olgagoo.debug.lessons.lesson_five.LessonFiveActivity;
import com.olgagoo.debug.lessons.lesson_one.LessonOneActivity;

public class MenuActivity extends Activity {
    Button lsOne;
    Button lsTwo;
    View.OnClickListener lsOneClk;
    View.OnClickListener lsTwoClk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        lsOne = (Button) findViewById(R.id.menu_btn1);
        lsTwo = (Button) findViewById(R.id.menu_btn2);

        final Intent lessonOneActivity = new Intent(this,LessonOneActivity.class);
        final Intent lessonFiveActivity = new Intent(this,LessonFiveActivity.class);


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

        lsOne.setOnClickListener(lsOneClk);
        lsTwo.setOnClickListener(lsTwoClk);

    }

}
