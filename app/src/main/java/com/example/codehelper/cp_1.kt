package com.example.codehelper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cp_1 : AppCompatActivity() {
//    private lateinit var scaleGestureDetector: ScaleGestureDetector
//
//    private var scaleFactor = 1.0f
//    private lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cp1)
    val pdfButton : Button = findViewById(R.id.pdf)
    pdfButton.setOnClickListener {
        val intent = Intent(this,cpdf1::class.java)
        startActivity(intent)
    }
    val ytButton : Button = findViewById(R.id.yt)
    ytButton.setOnClickListener {
        val intent = Intent(this,cplay1::class.java)
        startActivity(intent)
    }
//        imageView = findViewById(R.id.cb)
//        scaleGestureDetector = ScaleGestureDetector(this, ScaleListener())
//    }
//    override fun onTouchEvent(motionEvent: MotionEvent): Boolean {
//        scaleGestureDetector.onTouchEvent(motionEvent)
//        return true
//    }
//    private inner class ScaleListener : ScaleGestureDetector.SimpleOnScaleGestureListener() {
//        override fun onScale(scaleGestureDetector: ScaleGestureDetector): Boolean {
//            scaleFactor *= scaleGestureDetector.scaleFactor
//            scaleFactor = max(0.1f, min(scaleFactor, 10.0f))
//            imageView.scaleX = scaleFactor
//            imageView.scaleY = scaleFactor
//            return true
//        }
    }
}