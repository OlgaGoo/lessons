package com.olgagoo.debug.lessons.lesson_six

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.ProgressBar
import com.olgagoo.debug.lessons.R

class ActivitySix : AppCompatActivity() {
    lateinit var recycler : RecyclerView
    lateinit var progressbar: ProgressBar

    //Services
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six)

        recycler = findViewById<RecyclerView>(R.id.recycler)
        progressbar = findViewById<ProgressBar>(R.id.progressbar)
        Log.e("Start", "fsdf")



        recycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false) // left to right
        recycler.setHasFixedSize(true)
    }

    override fun onResume() {
        super.onResume()
        bindService(Intent(this,Service::class.java),serviceConnector, Context.BIND_AUTO_CREATE)
    }

    override fun onPause() {
        super.onPause()
        unbindService(serviceConnector)
    }

    private val serviceConnector = object :ServiceConnection{
        override fun onServiceDisconnected(p0: ComponentName?) {
            Log.e("Start", "onServiceDisconnected")
        }

        override fun onServiceConnected(p0: ComponentName?, p1: IBinder?) {
            Log.e("Start", "onServiceConnected")
        }

    }


}
