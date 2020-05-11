package com.example.smkcodingchallange2

import android.content.Context
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter (fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity){
    private val Jumlah_menu = 2
    override fun getItemCount(): Int {
        return Jumlah_menu
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> {return Fragment_home()}
            1 -> {return ProfilFragment()}

            else->{
                return Fragment_home()
            }
        }
    }
}