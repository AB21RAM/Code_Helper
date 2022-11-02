package com.example.codehelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class java_prog1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java_prog1)
        val start_course : TextView = findViewById(R.id.startCourse)
        start_course.setOnClickListener {
            newpage()
        }
    }

    private fun newpage() {
        val intent = Intent(this, java_prog2::class.java)
        startActivity(intent)
    }
}