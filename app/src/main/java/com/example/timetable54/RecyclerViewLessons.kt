package com.example.timetable54

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewLessons(private val data: List<LessonModel>) :
    RecyclerView.Adapter<RecyclerViewLessons.ViewHolder>() {
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        var tv_number: TextView
        var tv_name_lesson: TextView
        var tv_name_teacher: TextView
        var tv_time:TextView
        var tv_cabinet:TextView
        init {
            tv_number=view.findViewById(R.id.tv_item_lesson_number)
            tv_name_lesson=view.findViewById(R.id.tv_item_lesson_name)
            tv_name_teacher=view.findViewById(R.id.tv_item_lesson_teacher)
            tv_time=view.findViewById(R.id.tv_item_lesson_time)
            tv_cabinet=view.findViewById(R.id.tv_item_lesson_cabinet)


        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_lesson, parent, false)
        return RecyclerViewLessons.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tv_number.text=(position+1).toString()
        if(data[position].cabinet_2==""){
            holder.tv_cabinet.text=data[position].cabinet_1
        }
        else{
            holder.tv_cabinet.text="${data[position].cabinet_1} / ${data[position].cabinet_2}"
        }
        holder.tv_time.text="${data[position].time_start} - ${data[position].time_end}"
        if(data[position].teacher_name_2==""){
            holder.tv_name_teacher.text=data[position].teacher_name_1
        }
        else{
            holder.tv_name_teacher.text="${data[position].teacher_name_1} / ${data[position].teacher_name_2}"
        }
        if(data[position].name_2==""){
            holder.tv_name_lesson.text=data[position].name_1
        }
        else{
            holder.tv_name_lesson.text="${data[position].name_1} / ${data[position].name_2}"
        }
//        holder.rv_lessons.adapter=
    }

    override fun getItemCount(): Int {
        return data.size
    }
}