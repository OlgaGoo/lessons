package com.olgagoo.debug.lessons.lesson_seven

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import android.widget.Toast
import android.widget.ViewFlipper
import com.olgagoo.debug.lessons.R
import com.olgagoo.debug.lessons.R.layout.activity_lesson_seven


class LessonSevenActivity: AppCompatActivity(){
    private var isFirstFragment = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_lesson_seven)
        sharedPref = getSharedPreferences(SHARED_NAME, Context.MODE_PRIVATE) // info is privet

        findViewById<TextView>(R.id.Header).setOnClickListener {
                changeFragment()

        }



    }

    private fun changeFragment(){
        val fragManager = supportFragmentManager

        val transactionFragment = fragManager.beginTransaction()


        if(isFirstFragment){
            transactionFragment.replace(R.id.fragment1, FragmentOne.getInstance())
            isFirstFragment = false
        } else {
            transactionFragment.replace(R.id.fragment1, Fragment2.getInstance())
        }

        transactionFragment.commit()

    }

    companion object {
        const  val SHARED_NAME = "FileName"
        const  val KEY_NAME = "Key1"
    }

    private lateinit var sharedPref:SharedPreferences

    override fun onStart() {
        super.onStart()
        val text = sharedPref.getString(KEY_NAME, "no value, default")
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show() //
    }

    override fun onStop() {
        super.onStop()
        sharedPref.edit().putString(KEY_NAME, "Value").apply() // save and apply, doesn't work w/o apply
    }




//    var onClick : OnItemClick? = null
//
//
//    //Listener for click on the item
//    interface OnItemClick{
//        fun onItemClick (student: Student)
//    }
}