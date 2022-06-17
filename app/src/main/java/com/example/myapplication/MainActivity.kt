package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.menu.CapaianActivity
import com.example.myapplication.menu.InformationActivity
import com.example.myapplication.menu.LessonActivity
import com.example.myapplication.menu.ProfileActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cardLesson.setOnClickListener {
           val startLesson = Intent(this, LessonActivity::class.java)
            startActivity(startLesson)
        }

        cardProfile.setOnClickListener {
            val startProfile = Intent(this, ProfileActivity::class.java)
            startActivity(startProfile)
        }

        cardAchieve.setOnClickListener {
            val startCapaian = Intent(this, CapaianActivity::class.java)
            startActivity(startCapaian)
        }

        cardInfo.setOnClickListener {
            val startInfo = Intent(this, InformationActivity::class.java)
            startActivity(startInfo)
        }
    }
}