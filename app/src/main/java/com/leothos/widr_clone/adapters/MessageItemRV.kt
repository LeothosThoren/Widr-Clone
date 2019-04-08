package com.leothos.widr_clone.adapters


import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.leothos.widr_clone.R
import com.leothos.widr_clone.models.MessageItem
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.item_fragment_message.view.*

class MessageItemRV(
    private val messageItem: MessageItem,
    private val fragment: Fragment
) : Item<ViewHolder>() {

    override fun getLayout(): Int {
        return R.layout.item_fragment_message
    }

    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.apply {
            messageName.text = messageItem.name
            messageComment.text = messageItem.comment
            messageCategory.text = messageItem.status
            messageDate.text = messageItem.date
            messageLocation.text = messageItem.location
            Glide.with(fragment).load(messageItem.urlPicture).apply(RequestOptions.circleCropTransform())
                .into(viewHolder.itemView.messagePicture)
        }

    }
}