package com.leothos.widr_clone.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MessageItem(
    val name: String,
    val comment: String,
    val date: String,
    val status: String,
    val location: String,
    val urlPicture: String
) : Parcelable