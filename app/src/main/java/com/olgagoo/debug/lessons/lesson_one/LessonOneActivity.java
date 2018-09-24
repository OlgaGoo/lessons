package com.olgagoo.debug.lessons.lesson_one;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.olgagoo.debug.lessons.BuildConfig;
import com.olgagoo.debug.lessons.R;
import com.olgagoo.debug.lessons.lesson_three.LessonThreeActivity;

public class LessonOneActivity extends Activity {
    Button logInOne;
    TextView password;
    TextView account;
    ImageView logo;
    View.OnClickListener logInOneClk;
    View.OnClickListener passInOneClk;
    View.OnClickListener userNameInOneClk;
    View.OnClickListener logoClk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one);

        logInOne = (Button) findViewById(R.id.login);
        password = (TextView) findViewById(R.id.password);
        account = (TextView) findViewById(R.id.username);
        logo = (ImageView)  findViewById(R.id.logo);

        account.setText(BuildConfig.SERVER_URL);




        logInOneClk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSecondActivity();
            }
        };
        logoClk = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSecondActivity();
                if(BuildConfig.DEBUG){
                    Log.i("Aaa","Logo clicked");
                    // also timber SDK can be used (popular library)
                }
            }
        };
        logInOne.setOnClickListener(logInOneClk);
        logo.setOnClickListener(logInOneClk);

    }

    private void startSecondActivity(){
        if(TextUtils.isEmpty((password.getText()))|| TextUtils.isEmpty(password.getText())){
            Log.d("Aaa","omg"); ///Debug only
            return;

        }

        LessonThreeActivity.show(LessonOneActivity.this, String.valueOf(account.getText()),String.valueOf(password.getText()));
    }

}
