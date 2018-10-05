package com.olgagoo.debug.lessons.lesson_six

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class Service: Service () {
    override fun onBind(p0: Intent?): IBinder? {
        Log.e("AAA", "Bind")
        return null
    }

    override fun onCreate() {
        super.onCreate()
        Log.e("AAA", "Created")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("AAA", "Destroy")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
        Log.e("AAA", "onStartCommand")
    }

    override fun onUnbind(intent: Intent?): Boolean {
        return super.onUnbind(intent)
        Log.e("AAA", "unBind")
    }

}