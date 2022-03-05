package com.example.timetable54

data class DayOfWeekModel(val name: String, val lessons: List<LessonModel>)
data class LessonModel(val name_1: String,val name_2: String, val time_start: String, val time_end: String, val cabinet_1: String,val cabinet_2: String, val teacher_name_1: String, val teacher_name_2: String)
