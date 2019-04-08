package com.leothos.widr_clone.ui.fragments.tab_fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.leothos.widr_clone.R

/**
 * This fragment is a part of of the view pager associated with tabs.
 * The tab layout is included inside the header fragment which corresponds to the main page of the app.
 * This fragment displays all profiles associated with the account.
 ***/

class TabProfileFragment : Fragment() {

    fun newInstance(): TabProfileFragment {
        return TabProfileFragment()
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_tab_profile, container, false)
        return view
    }
}
