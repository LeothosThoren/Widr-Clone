package com.leothos.widr_clone.ui.fragments.tab_fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.leothos.widr_clone.R
import com.leothos.widr_clone.adapters.AnnouncementItemRV
import com.leothos.widr_clone.ui.fragments.ModalBottomFragment
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.recycler_view_include.*

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

        adapter.add(AnnouncementItemRV(this))
        adapter.add(AnnouncementItemRV(this))

        recyclerview.adapter = adapter

        adapter.setOnItemClickListener { item, view ->
            openModalSheet()
        }
    }

    private fun openModalSheet() {
        val modalFragment = ModalBottomFragment()
        modalFragment.newInstance()
            .show(childFragmentManager, "MODAL")
    }

}
