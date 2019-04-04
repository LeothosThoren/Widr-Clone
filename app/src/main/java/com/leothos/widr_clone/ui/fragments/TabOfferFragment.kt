package com.leothos.widr_clone.ui.fragments


import com.leothos.widr_clone.R
import com.leothos.widr_clone.base.BaseFragment


/**
 * This fragment is a part of of the view pager associated with tabs.
 * The tab layout is included inside the header fragment which corresponds to the main page of the app.
 * This fragment displays offers
 ***/
class TabOfferFragment : BaseFragment() {


    fun newInstance(): TabOfferFragment {
        return TabOfferFragment()
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_tab_offer
    }

}
