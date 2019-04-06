package com.leothos.widr_clone.ui.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.leothos.widr_clone.R


/**
 * This fragment is a part of of the view pager associated with tabs.
 * The tab layout is included inside the header fragment which corresponds to the main page of the app.
 * This fragment displays offers
 ***/
class TabOfferFragment : Fragment() {


    fun newInstance(): TabOfferFragment {
        return TabOfferFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_tab_offer, container, false)
        return view
    }

}
