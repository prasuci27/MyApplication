package com.example.myapplication.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import com.example.myapplication.gui.GuiActivity
import com.example.myapplication.materi.VideoGuiActivity
import com.example.myapplication.materi.VideoTextActivity
import com.example.myapplication.text.TextActivity
import kotlinx.android.synthetic.main.activity_lesson.*

class LessonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson)

        cardGui.setOnClickListener {
            val startGui = Intent(this, GuiActivity::class.java)
            startActivity(startGui)
        }

        cardText.setOnClickListener {
            val startText = Intent(this, TextActivity::class.java)
            startActivity(startText)
        }

        videoGui.setOnClickListener {
            val startVideoGui= Intent(this, VideoGuiActivity::class.java)
            startActivity(startVideoGui)
        }

       videoText.setOnClickListener {
           val startVideoText = Intent(this, VideoTextActivity::class.java)
           startActivity(startVideoText)
       }

    }
}