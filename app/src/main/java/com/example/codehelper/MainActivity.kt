package com.example.codehelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val image : ImageView = findViewById(R.id.MainImage)
        image.setOnClickListener{
            newPage()
        }
    }

    private fun newPage() {
        val intent = Intent(this, SecondPageActivity::class.java)
        startActivity(intent)// start the activity
    }
}