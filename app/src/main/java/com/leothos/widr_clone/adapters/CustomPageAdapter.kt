package com.leothos.widr_clone.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.leothos.widr_clone.R
import com.leothos.widr_clone.formatTitle
import com.leothos.widr_clone.ui.fragments.tab_fragment.TabAnnouncementFragment
import com.leothos.widr_clone.ui.fragments.tab_fragment.TabOfferFragment
import com.leothos.widr_clone.ui.fragments.tab_fragment.TabProfileFragment


/**
 * Simple adapter class to handle viewPager and tabLayout
 * */

class CustomPageAdapter(
    fm: FragmentManager?,
    val context: Context?
) : FragmentPagerAdapter(fm) {


    override fun getItem(position: Int): Fragment? {
        return when (position) {
            0 //tab number 1
            -> TabAnnouncementFragment().newInstance()
            1 //tab number 2
            -> TabOfferFragment().newInstance()
            2 //tab number 3
            -> TabProfileFragment().newInstance()
            else -> null
        }
    }

    override fun getCount(): Int = 3

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> return context?.formatTitle(R.string.first_tab_title)
            1 -> return context?.formatTitle(R.string.second_tab_title)
            2 -> return context?.formatTitle(R.string.third_tab_title)
            else -> null
        }
    }
}