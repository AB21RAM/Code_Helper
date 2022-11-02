package com.example.codehelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class cpdf1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cpdf)
        val Pdfview : PDFView = findViewById(R.id.pdfview)
        Pdfview.fromAsset("code.pdf")
            .pages(0,1,2,3,4,5,6)
            .load()
    }
}