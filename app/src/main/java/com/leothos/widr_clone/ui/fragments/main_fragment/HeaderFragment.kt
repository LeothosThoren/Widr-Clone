package com.leothos.widr_clone.ui.fragments.main_fragment


import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.google.android.material.tabs.TabLayout
import com.leothos.widr_clone.R
import com.leothos.widr_clone.adapters.CustomPageAdapter
import com.leothos.widr_clone.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_header.*

class HeaderFragment : BaseFragment() {

    override fun getToolbar(): Toolbar {
        return toolbar
    }

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

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater?.inflate(R.menu.toolbar_search, menu)
        configureSpinner()
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.toolbar_search_item -> {
                Toast.makeText(activity, "Search icon activated", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun configureSpinner() {
        val spinnerAdapter = ArrayAdapter.createFromResource(context!!, R.array.spinner, R.layout.spinner_item)
        spinnerAdapter.setDropDownViewResource(R.layout.spinner_drop_down_item)
        spinner.adapter = spinnerAdapter
    }
}


