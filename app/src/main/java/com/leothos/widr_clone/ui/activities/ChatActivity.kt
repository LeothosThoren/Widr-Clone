package com.leothos.widr_clone.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.leothos.widr_clone.EXTRA_INTENT_MESSAGE_ITEM
import com.leothos.widr_clone.R
import com.leothos.widr_clone.models.MessageItem
import kotlinx.android.synthetic.main.activity_chat.*
import kotlinx.android.synthetic.main.custom_toolbar.*

class ChatActivity : AppCompatActivity() {
    // var
    private lateinit var messageItem: MessageItem

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
        messageItem = intent.getParcelableExtra(EXTRA_INTENT_MESSAGE_ITEM)

        // Methods
        updateUI(messageItem)
        upActionButton()
    }

    /**
     * Custom up button inside the toolbar
     * */
    private fun upActionButton() {
        customToolbar.setOnClickListener {
            finish()
        }
    }

    /**
     * Method to perform binding between views and data
     * */
    private fun updateUI(messageItem: MessageItem) {
        Glide.with(this).load(messageItem.urlPicture)
            .apply(RequestOptions.circleCropTransform())
            .into(chatUserPicture)
        chatUserName.text = messageItem.name
    }
}
