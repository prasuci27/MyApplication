package com.example.myapplication.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.MainActivity
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_information.*

class InformationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)

        home.setOnClickListener {
            val backHome1 = Intent(this, MainActivity::class.java)
            startActivity(backHome1)
        }

    }
}