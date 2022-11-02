package com.example.codehelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast

class StartPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_page)
        Toast.makeText(this, "Nice to See You Here", Toast.LENGTH_LONG).show()
        val c_prog :LinearLayout = findViewById(R.id.c_prog)
        val cpp_prog :LinearLayout = findViewById(R.id.cpp_prog)
        val java_prog :LinearLayout = findViewById(R.id.java_prog)
        val py_prog :LinearLayout = findViewById(R.id.py_prog)
        c_prog.setOnClickListener {
            start_c_prog()
        }
        cpp_prog.setOnClickListener {
            start_cpp_prog()
        }
        java_prog.setOnClickListener {
            start_java_prog()
        }
        py_prog.setOnClickListener {
            start_py_prog()
        }
    }

    private fun start_py_prog() {
        val intent = Intent(this, py_prog1::class.java)
        startActivity(intent)
    }

    private fun start_java_prog() {
        val intent = Intent(this, java_prog1::class.java)
        startActivity(intent)
    }

    private fun start_cpp_prog() {
        val intent = Intent(this, cpp_prog1::class.java)
        startActivity(intent)
    }

    private fun start_c_prog() {
        val intent = Intent(this, C_prog1::class.java)
        startActivity(intent)
    }
}