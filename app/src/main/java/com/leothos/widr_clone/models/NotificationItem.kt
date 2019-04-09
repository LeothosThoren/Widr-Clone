package com.leothos.widr_clone.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class NotificationItem(
    val userName: String,
    val urlPicture: String,
    val notificationMessage: String,
    val date: String,
    val isRead: Boolean

) : Parcelable
