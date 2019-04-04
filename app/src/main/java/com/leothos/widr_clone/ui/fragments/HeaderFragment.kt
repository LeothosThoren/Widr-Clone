package com.leothos.widr_clone.ui.fragments


import com.google.android.material.tabs.TabLayout
import com.leothos.widr_clone.R
import com.leothos.widr_clone.adapters.CustomPageAdapter
import com.leothos.widr_clone.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_header.*

class HeaderFragment : BaseFragment() {

    override fun getLayoutId(): Int {
        return R.layout.fragment_header
    }

    override fun onResume() {
        super.onResume()
        configureViewPagerAndTabs()
    }

    //****************
    // Configurations
    // ***************

    private fun configureViewPagerAndTabs() {
        viewPager.adapter = CustomPageAdapter(childFragmentManager, context)
        tabLayout.apply {
            setupWithViewPager(viewPager)
            tabMode = TabLayout.MODE_SCROLLABLE
        }
    }
}
