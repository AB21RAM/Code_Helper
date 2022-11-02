package com.example.codehelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayoutStates.TAG
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase



class mentorPage : AppCompatActivity() {

    private lateinit var auth : FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentor_page)

        auth = FirebaseAuth.getInstance()
        val db = Firebase.firestore
        val udoubt: EditText = findViewById(R.id.doubt)
        val ulang :EditText = findViewById(R.id.lang)
        val email = intent.getStringExtra("email")
        val emailText: TextView = findViewById(R.id.emailtext)
        emailText.text = email
//        val displayName = intent.getStringExtra("name")
        val button : Button=findViewById<Button>(R.id.send)
        button.setOnClickListener {
            val userid = FirebaseAuth.getInstance().currentUser!!.uid
            val sdoubt =udoubt.text.toString().trim()
            val slang = ulang.text.toString().trim()
            val data_map = hashMapOf(
                "Doubt" to sdoubt,
                "Language" to slang,
                "E-mail" to email
            )
//            .document(userid)
            db.collection("Student Doubt").add(data_map).addOnSuccessListener {
                Toast.makeText(this, "Your response Stored Succesfully", Toast.LENGTH_SHORT).show()
                udoubt.text.clear()
                ulang.text.clear()
            }
        }


    }
}