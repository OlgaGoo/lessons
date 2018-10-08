package com.olgagoo.debug.lessons.lesson_seven

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.olgagoo.debug.lessons.R
import kotlinx.android.synthetic.main.activity_lesson_seven.*

class Fragment2 : Fragment(){

    companion object {

        fun getInstance(): Fragment2{
            return Fragment2()

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    //just initialization
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_two, fragment2,false)
    }

    // here code
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //
    }

    /// Add to view
    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }


}