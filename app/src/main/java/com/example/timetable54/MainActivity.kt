package com.example.timetable54

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.timetable54.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun seacrh(view: View) {
        if(binding.etClassNumber.text.toString() == "10" && binding.etClassLetter.text.toString() == "М")
        {
            val intent = Intent(this,MainContent::class.java)
            startActivity(intent)
        }
        else{
            Snackbar.make(binding.root,"Простите, пока нет расписания вашего класса", Snackbar.LENGTH_SHORT).show()
        }
    }
}