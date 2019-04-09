package com.leothos.widr_clone

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

/**
 * @param string
 * This method takes a string value (from res/values folder) as parameter and capitalize it.
 * */
fun Context.formatTitle(string: Int): String {
    val str: String = this.resources?.getString(string).toString()
    return str.capitalize()
}

/**
 * @param toolbar
 * This method allow the fragment to set up easily a custom toolbar
 *
 * */
fun Activity.setUpToolbar(toolbar: Toolbar) {
    this as AppCompatActivity
    setSupportActionBar(toolbar)
    supportActionBar?.setDisplayShowTitleEnabled(false)
    supportActionBar?.setDisplayHomeAsUpEnabled(false)
}