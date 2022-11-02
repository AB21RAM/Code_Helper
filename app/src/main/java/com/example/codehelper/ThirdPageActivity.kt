package com.example.codehelper

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth

class ThirdPageActivity : AppCompatActivity() {

    private lateinit var auth : FirebaseAuth

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_page)

        auth = FirebaseAuth.getInstance()

        val email = intent.getStringExtra("email")
        val displayName = intent.getStringExtra("name")
//        val photo_profile = intent("photo")
        findViewById<TextView>(R.id.emailtext).text = email
        findViewById<TextView>(R.id.name).text = " "+displayName
//        findViewById<ImageView>(R.id.imageView1).setImageDrawable(photo_profile)
        findViewById<Button>(R.id.logout).setOnClickListener {
            auth.signOut()
            startActivity(Intent(this , SecondPageActivity::class.java))
        }
        val button_next :Button = findViewById(R.id.start_next)
        button_next.setOnClickListener{
            newpage()
        }
        val button_mentor :Button = findViewById(R.id.mentor)
        button_mentor.setOnClickListener{
            val intent = Intent(this, mentorPage::class.java)
            intent.putExtra("email" , email)
            startActivity(intent)
        }
    }

    private fun newpage() {
        val intent = Intent(this, StartPageActivity::class.java)
        startActivity(intent)
    }

}