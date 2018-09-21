package com.olgagoo.debug.lessons.lesson_one;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.olgagoo.debug.lessons.R;
import com.olgagoo.debug.lessons.lesson_three.LessonThreeActivity;

public class LessonOneActivity extends Activity {
    Button logInOne;
    TextView password;
    TextView account;
    View.OnClickListener logInOneClk;
    View.OnClickListener passInOneClk;
    View.OnClickListener userNameInOneClk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one);

        logInOne = (Button) findViewById(R.id.login);
        password = (TextView) findViewById(R.id.password);
        account = (TextView) findViewById(R.id.username);


        logInOneClk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSecondActivity();
            }
        };
        logInOne.setOnClickListener(logInOneClk);

    }

    private void startSecondActivity(){
        if(TextUtils.isEmpty((password.getText()))|| TextUtils.isEmpty(password.getText())){
            return;
        }

        LessonThreeActivity.show(LessonOneActivity.this, String.valueOf(account.getText()),String.valueOf(password.getText()));
    }

}
