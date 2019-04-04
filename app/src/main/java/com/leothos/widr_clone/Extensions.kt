package com.leothos.widr_clone

import android.content.Context

/**
 * @param string
 * This method takes a string value from res/values folder a parameter and capitalize it.
 * */
fun Context.formatTitle(string: Int): String {
    val str: String = this.resources?.getString(string).toString()
    return str.capitalize()
}