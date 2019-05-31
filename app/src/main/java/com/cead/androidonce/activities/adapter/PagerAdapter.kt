package com.cead.androidonce.activities.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.cead.androidonce.activities.fragments.FirstFragment
import com.cead.androidonce.activities.fragments.SecondFragment
import com.cead.androidonce.activities.fragments.ThirdFragment

class PagerAdapter(fm: FragmentManager, var tabs: Int) : FragmentStatePagerAdapter(fm) {




    override fun getItem(position: Int): Fragment? {

        when(position){
            0 ->{
                return FirstFragment()
            }
            1 ->{
                return SecondFragment()
            }
            2 ->{
                return ThirdFragment()
            }else ->{
             return null
            }
        }



    }

    override fun getCount(): Int {
        return  tabs
    }
}