package com.example.myapplication.text

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.R

class TextActivity : AppCompatActivity() {

    private var title = "Instal Linux Berbasis Text"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text)

        setActionBarTitle(title)

        val viewPager2 : ViewPager2 = findViewById(R.id.view_pager2)

        val fragments : ArrayList<Fragment> = arrayListOf(

            SatuFragment(),
            DuaFragment(),
            TigaFragment(),
            EmpatFragment(),
            LimaFragment(),
            EnamFragment(),
            TujuhFragment(),
            LapanFragment(),
            SembilanFragment(),
            SepuluhFragment(),
            SebelasFragment(),
            DuabelasFragment()
        )

        val adapter = TextPagerAdapter(fragments, this)
        viewPager2.adapter = adapter
    }

    private fun setActionBarTitle(title: String){
        supportActionBar?.title = title
    }
}