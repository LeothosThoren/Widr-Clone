package com.leothos.widr_clone.ui.fragments


import com.leothos.widr_clone.R
import com.leothos.widr_clone.base.BaseFragment

/**
 * This fragment is a part of of the view pager associated with tabs.
 * The tab layout is included inside the header fragment which corresponds to the main page of the app.
 * This fragment displays all profiles associated with the account.
 ***/

class TabProfileFragment : BaseFragment() {

    fun newInstance(): TabProfileFragment {
        return TabProfileFragment()
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_tab_profile
    }

}
