package com.example.myapplication.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.MainActivity
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        home.setOnClickListener {
            val backHome = Intent(this, MainActivity::class.java)
            startActivity(backHome)
        }
    }
}