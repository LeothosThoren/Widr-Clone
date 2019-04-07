package com.leothos.widr_clone.ui.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.leothos.widr_clone.R
import com.leothos.widr_clone.adapters.AnnouncementItem
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.fragment_tab_announcement.*

/**
 * This fragment is a part of of the view pager associated with tabs.
 * The tab layout is included inside the header fragment which corresponds to the main page of the app.
 * This particular fragment display a list with different features like a carousel which contains a map for example
 ***/
class TabAnnouncementFragment : Fragment() {

    fun newInstance(): TabAnnouncementFragment {
        return TabAnnouncementFragment()
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_tab_announcement, container, false)

        return view
    }

    override fun onResume() {
        super.onResume()
        // methods
        configureRecyclerView()
    }

    private fun configureRecyclerView() {
        val adapter = GroupAdapter<ViewHolder>()

        adapter.add(AnnouncementItem())
        adapter.add(AnnouncementItem())

        recyclerview_tab_announcement.adapter = adapter
    }

}
