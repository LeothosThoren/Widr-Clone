package com.leothos.widr_clone.adapters

import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.leothos.widr_clone.NUMBER_OF_PAGE
import com.leothos.widr_clone.R
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.item_fragment_tab_announcement.view.*


class AnnouncementItemRV(val fragment: Fragment) : Item<ViewHolder>() {


    override fun getLayout(): Int {
        return R.layout.item_fragment_tab_announcement
    }

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.carouselView.pageCount = NUMBER_OF_PAGE
        viewHolder.itemView.carouselView.setViewListener {
            var layout = 0
            when (it) {
                0 -> layout = R.layout.carousel_offer
                1 -> layout = R.layout.carousel_recommandation
                2 -> layout = R.layout.carousel_map
                else -> R.layout.carousel_recommandation
            }

            fragment.layoutInflater.inflate(layout, null)

        }
        Glide.with(fragment).load(R.drawable.woman).apply(RequestOptions.circleCropTransform())
            .into(viewHolder.itemView.tabAnnouncementPhoto)
    }
}