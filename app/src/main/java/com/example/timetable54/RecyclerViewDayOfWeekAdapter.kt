package com.example.timetable54
import android.service.autofill.Dataset
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewDayOfWeekAdapter(private val data: List<DayOfWeekModel>) :
    RecyclerView.Adapter<RecyclerViewDayOfWeekAdapter.ViewHolder>() {
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        var tv_name: TextView
        var rv_lessons: RecyclerView
        init {
            tv_name=view.findViewById(R.id.tv_item_week_name)
            rv_lessons = view.findViewById(R.id.rv_item_lessons)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_day_of_week, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tv_name.text=data[position].name
        holder.rv_lessons.adapter=RecyclerViewLessons(data[position].lessons)
        holder.rv_lessons.layoutManager=LinearLayoutManager(holder.itemView.context)
    }
    override fun getItemCount(): Int {
        return data.size
    }
}