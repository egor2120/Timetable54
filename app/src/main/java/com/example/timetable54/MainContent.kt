package com.example.timetable54

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.timetable54.databinding.ActivityMainBinding
import com.example.timetable54.databinding.ActivityMainContentBinding

class MainContent : AppCompatActivity() {
    lateinit var binding: ActivityMainContentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainContentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val data = listOf(DayOfWeekModel("понедельник", listOf(LessonModel("алгебра","","8:00","8:45","B32","","Смирнова Е.Ю.", "Горяшин Д.В."),
            LessonModel("алгебра","","9:00","9:45","B32","","Смирнова Е.Ю.", "Горяшин Д.В."))),DayOfWeekModel("вторник",
            listOf(LessonModel("геометрия","","8:00","8:45","B32","","Васильев М.Ю.", "Тихон"),
            LessonModel("геометрия","","9:00","9:45","B32","","Васильев М.Ю.", "Тихон"))))
        binding.rv.adapter = RecyclerViewDayOfWeekAdapter(data)
        binding.rv.layoutManager = LinearLayoutManager(this)
    }
}