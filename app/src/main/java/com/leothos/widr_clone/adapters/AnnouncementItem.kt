package com.leothos.widr_clone.adapters

import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.leothos.widr_clone.R
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.item_fragment_tab_announcement.view.*

class AnnouncementItem(val fragment: Fragment) : Item<ViewHolder>() {
    override fun getLayout(): Int {
        return R.layout.item_fragment_tab_announcement
    }

    override fun bind(viewHolder: ViewHolder, position: Int) {
        Glide.with(fragment).load(R.drawable.woman).apply(RequestOptions.circleCropTransform())
            .into(viewHolder.itemView.tabAnnouncementPhoto)
    }
}