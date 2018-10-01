package com.olgagoo.debug.lessons.lesson_two

import android.app.Activity
import android.os.Bundle
import com.olgagoo.debug.lessons.R

class KotlinLessonActivity : Activity() {

    var test: Int = 0
    val test1: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        test = 10

        val mySin = SingltoneMy

        savedInstanceState.toString()
    }
}