package com.leothos.widr_clone.ui.fragments.main_fragment


import android.content.Intent
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.DividerItemDecoration
import com.leothos.widr_clone.EXTRA_INTENT_MESSAGE_ITEM
import com.leothos.widr_clone.R
import com.leothos.widr_clone.adapters.MessageItemRV
import com.leothos.widr_clone.base.BaseFragment
import com.leothos.widr_clone.data.DummyDataMessageList
import com.leothos.widr_clone.ui.activities.ChatActivity
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.fragment_message.*
import kotlinx.android.synthetic.main.recycler_view_include.*

class MessageFragment : BaseFragment() {

    private val dummyData = DummyDataMessageList.messageItem
    private val adapter = GroupAdapter<ViewHolder>()

    override fun getToolbar(): Toolbar {
        return messageToolbar
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_message
    }

    override fun onResume() {
        super.onResume()
        messageToolbar.title = "Messages"
        configureRecyclerView()
        Log.d("TAG", "${dummyData.size}")


    }

    private fun configureRecyclerView() {
        dummyData.forEach {
            adapter.add(MessageItemRV(it, this))
        }
        recyclerview.adapter = adapter
        recyclerview.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))

        adapter.setOnItemClickListener { item, view ->
            // Cast model into parcelable
            val messageItem = item as MessageItemRV
            val intent = Intent(context, ChatActivity::class.java)
            // Add variable into parcelable intent in roder to retrieve data easily
            intent.putExtra(EXTRA_INTENT_MESSAGE_ITEM, messageItem.messageItem)
            // Start activity
            startActivity(intent)
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater?.inflate(R.menu.toolbar_search, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.menu.toolbar_search -> {
                Toast.makeText(activity, "Search icon activated on message", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}
