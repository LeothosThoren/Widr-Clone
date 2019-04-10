package com.leothos.widr_clone.adapters


import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.leothos.widr_clone.R
import com.leothos.widr_clone.models.NotificationItem
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.item_fragment_notification.view.*

class NotificationItemRV(
    val notificationItem: NotificationItem,
    val fragment: Fragment
) : Item<ViewHolder>() {

    override fun getLayout(): Int {
        return R.layout.item_fragment_notification
    }

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.apply {
            notificationDate.text = notificationItem.date
            notificationComment.text = notificationItem.notificationMessage
            Glide.with(fragment).load(notificationItem.urlPicture).apply(RequestOptions.circleCropTransform())
                .into(notificationUserPicture)
        }
    }
}