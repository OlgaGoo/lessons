package com.olgagoo.debug.lessons.lesson_three;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.olgagoo.debug.lessons.R;
import com.squareup.picasso.Picasso;

public class LessonThreeActivity extends AppCompatActivity {
    public static final String EXTRA_PASSWORD = "EXTRA_PASSWORD";
    public static final String EXTRA_USERNAME = "EXTRA_USERNAME";
    ImageView image;


    public static void show(Activity activity, String username, String password){

        Intent intent = new Intent(activity,LessonThreeActivity.class);

        intent.putExtra(EXTRA_PASSWORD,String.valueOf(username));
        intent.putExtra(EXTRA_USERNAME,String.valueOf(password));

        activity.startActivity(intent);
       // activity.overridePendingTransition(R.anim.ischezaet,R.anim.poyavlyaetsya); // when start
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_three);

        Intent intent = getIntent();

        String password = intent.getStringExtra(EXTRA_PASSWORD);
        String account = intent.getStringExtra(EXTRA_USERNAME);

        TextView textView = findViewById(R.id.passinput);

        textView.setText(password+ "////"+ account);

        image = (ImageView) findViewById(R.id.imagebylink);

        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(image);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        // activity.overridePendingTransition(R.anim.ischezaet,R.anim.poyavlyaetsya); // back button
    }
}
