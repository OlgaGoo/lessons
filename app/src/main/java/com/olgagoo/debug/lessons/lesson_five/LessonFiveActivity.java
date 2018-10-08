package com.olgagoo.debug.lessons.lesson_five;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.olgagoo.debug.lessons.R;
import com.olgagoo.debug.lessons.lesson_two.ClockView;

public class LessonFiveActivity extends Activity {
    View clockView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_five);
        clockView = (View) findViewById(R.id.clockView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter intFilter = new IntentFilter();
        Intent intent = new Intent(this, LessonFiveActivity.class);
        intFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(wifireciver,intFilter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(wifireciver);
    }

    private BroadcastReceiver wifireciver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            intent.getAction();
            Log.e("AAA","onReceive" + intent.getAction());
        }


    };

}
