package com.leothos.widr_clone.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * Abstract class that handles the basic required elements to set fragments.
 * Heritage is used here to reduce code repetitions and provide readability.
 * */

abstract class BaseFragment : Fragment() {

    // OVERRIDE ---
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(getLayoutId(), container, false)
    }

    // ABSTRACT ---
    abstract fun getLayoutId(): Int

    // TOOLBAR ---

}