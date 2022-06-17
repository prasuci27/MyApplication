package com.example.myapplication.gui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.R

class GuiActivity : AppCompatActivity() {

    private var title = "Instal Linux Berbasis GUI"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gui)

        setActionBarTitle(title)

        val viewPager : ViewPager2 = findViewById(R.id.view_pager)

        val fragments : ArrayList<Fragment> = arrayListOf(
            Page1Fragment(),
            Page2Fragment(),
            Page3Fragment(),
            Page4Fragment(),
            Page5Fragment(),
            Page6Fragment(),
            Page7Fragment(),
            Page8Fragment(),
            Page9Fragment(),
            Page10Fragment(),
            Page11Fragment(),
            Page12Fragment(),
            Page13Fragment(),
            Page14Fragment(),
            Page15Fragment(),
            Page16Fragment()
        )

        val adapter = GuiPagerAdapter(fragments, this)
        viewPager.adapter = adapter
    }

    private fun setActionBarTitle(title: String){
        supportActionBar?.title = title
    }
}