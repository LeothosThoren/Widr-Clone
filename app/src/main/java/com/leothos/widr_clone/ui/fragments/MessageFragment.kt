package com.leothos.widr_clone.ui.fragments


import androidx.appcompat.widget.Toolbar
import com.leothos.widr_clone.R
import com.leothos.widr_clone.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_message.*

class MessageFragment : BaseFragment() {

//    override fun getMenuItem(): Int {
//        return R.menu.toolbar_search
//    }

    override fun getToolbar(): Toolbar {
        return toolbar
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_message
    }
}
