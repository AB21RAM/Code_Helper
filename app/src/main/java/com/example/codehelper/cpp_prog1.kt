package com.example.codehelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class cpp_prog1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cpp_prog1)
        val start_course : TextView = findViewById(R.id.startCourse)
        start_course.setOnClickListener {
            newpage()
        }
    }

    private fun newpage() {
        val intent = Intent(this, cpp_prog2::class.java)
        startActivity(intent)
    }
}