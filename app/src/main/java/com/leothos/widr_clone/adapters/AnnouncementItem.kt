package com.leothos.widr_clone.adapters

import com.leothos.widr_clone.R
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder

class AnnouncementItem : Item<ViewHolder>() {
    override fun getLayout(): Int {
        return R.layout.item_fragment_tab_announcement
    }

    override fun bind(viewHolder: ViewHolder, position: Int) {
        // will handle later
    }
}