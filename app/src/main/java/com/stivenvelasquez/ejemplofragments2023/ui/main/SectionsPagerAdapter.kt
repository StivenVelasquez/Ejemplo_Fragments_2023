package com.stivenvelasquez.ejemplofragments2023.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.stivenvelasquez.ejemplofragments2023.*

private val TAB_TITLES = arrayOf(
    R.string.superman,
    R.string.batman,
    R.string.flash,
    R.string.wonder_woman
    )

class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when(position){
            0-> return SupermanFragment()
            1-> return BatmanFragment()
            2-> return FlashFragment()
            else->WonderWomanFragment()

        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        return 4
    }
}