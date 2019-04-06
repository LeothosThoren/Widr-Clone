package com.leothos.widr_clone.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.leothos.widr_clone.setUpToolbar

/**
 * Abstract class that handles the basic required elements to set fragments.
 * Heritage is used here to reduce code repetitions and provide readability.
 * */

abstract class BaseFragment : Fragment() {

    // OVERRIDE ---
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(getLayoutId(), container, false)
    }

    override fun onResume() {
        super.onResume()
        activity?.setUpToolbar(getToolbar())
//        getMenuItem()
        setHasOptionsMenu(true)
    }

//    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
//        inflater?.inflate(getMenuItem(), menu)
//        super.onCreateOptionsMenu(menu, inflater)
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return when (item.itemId) {
//            getMenuItem() -> {
//                Toast.makeText(activity, "Search icon activated", Toast.LENGTH_SHORT).show()
//                true
//            }
//            else -> super.onOptionsItemSelected(item)
//        }
//    }

    // ABSTRACT ---
    abstract fun getLayoutId(): Int

    abstract fun getToolbar(): Toolbar

//    abstract fun getMenuItem(): Int



}