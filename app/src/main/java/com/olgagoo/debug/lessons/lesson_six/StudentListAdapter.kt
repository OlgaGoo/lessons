package com.olgagoo.debug.lessons.lesson_six

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.olgagoo.debug.lessons.R
import kotlinx.android.synthetic.main.item.view.*

class StudentListAdapter: RecyclerView.Adapter<StudentListAdapter.Holder>() {
    private val dataList: List<Student> = emptyList()


    override fun onCreateViewHolder(parent: ViewGroup, position: Int): Holder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val student = dataList[position]
        holder.nameTextView.setText(student.name)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }


    inner class Holder: RecyclerView.ViewHolder{

        var nameTextView: TextView
        var secondNameTextView: TextView

        constructor(view: View) :super(view){
            nameTextView = view.findViewById(R.id.nameField)
            secondNameTextView = view.findViewById(R.id.secindNameField)
        }

    }
}