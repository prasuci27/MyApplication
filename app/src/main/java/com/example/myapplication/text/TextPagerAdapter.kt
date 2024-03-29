package com.example.myapplication.text

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class TextPagerAdapter (
    val item: ArrayList<Fragment>,
    activity : AppCompatActivity
    ) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return item.size
    }

    override fun createFragment(position: Int): Fragment {
        return item[position]
    }
}