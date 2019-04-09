package com.leothos.widr_clone.ui.fragments.main_fragment

import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.DividerItemDecoration
import com.leothos.widr_clone.R
import com.leothos.widr_clone.adapters.NotificationItemRV
import com.leothos.widr_clone.base.BaseFragment
import com.leothos.widr_clone.data.DummyDataNotificationList
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.fragment_notification.*
import kotlinx.android.synthetic.main.recycler_view_include.*


class NotificationFragment : BaseFragment() {

    private val adapter = GroupAdapter<ViewHolder>()
    private val notificationData = DummyDataNotificationList.notificationList


    override fun getToolbar(): Toolbar {
        return notificationToolbar
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_notification
    }

    override fun onResume() {
        super.onResume()
        notificationToolbar.title = "Notifications"
        configureRecyclerView()
    }

    //****************
    // Configurations
    //****************

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater?.inflate(R.menu.toolbar_settings, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.toolbar_settings_item -> {
                Toast.makeText(activity, "settings icon activated", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun configureRecyclerView() {
        notificationData.forEach {
            adapter.add(NotificationItemRV(it, this))
        }
        recyclerview.adapter = adapter
        recyclerview.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
    }
}