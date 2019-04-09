package com.leothos.widr_clone.data

import com.leothos.widr_clone.models.NotificationItem

object DummyDataNotificationList {

    val notificationList: MutableList<NotificationItem> = mutableListOf()

    init {

        notificationList.add(
            NotificationItem(
                "Riley Cooper",
                "https://randomuser.me/api/portraits/men/43.jpg",
                "We need your help, " +
                        "Riley Cooper is looking for an osteopath in Paris, maybe you'd know someone?",
                "12 Jan", false
            )
        )

        notificationList.add(
            NotificationItem(
                "Anna Mendez",
                "https://randomuser.me/api/portraits/women/56.jpg",
                "Anna Mendez accepted your mutual contacts request",
                "12 Jan", false
            )
        )

        notificationList.add(
            NotificationItem(
                "Riley Cooper",
                "https://randomuser.me/api/portraits/men/43.jpg",
                "Riley Cooper declined your mutual contacts request",
                "12 Jan", false
            )
        )

        notificationList.add(
            NotificationItem(
                "Samantha Reed",
                "https://randomuser.me/api/portraits/women/76.jpg",
                "We need your help, " +
                        "Samantha Reed is looking for an osteopath in Paris, maybe you'd know someone?",
                "12 Jan", false
            )
        )

        notificationList.add(
            NotificationItem(
                "Gary Carlson",
                "https://randomuser.me/api/portraits/men/44.jpg",
                "We need your help, " +
                        "Gary Carlson is looking for an osteopath in Paris, maybe you'd know someone?",
                "11 Jan", true
            )
        )

        notificationList.add(
            NotificationItem(
                "Larry Green",
                "https://randomuser.me/api/portraits/men/45.jpg",
                "We need your help, " +
                        "Larry Green is looking for an osteopath in Paris, maybe you'd know someone?",
                "11 Jan", false
            )
        )

        notificationList.add(
            NotificationItem(
                "Grace Johnson",
                "https://randomuser.me/api/portraits/women/75.jpg",
                "We need your help, " +
                        "Grace Johnson is looking for an osteopath in Paris, maybe you'd know someone?",
                "11 Jan", true
            )
        )
    }
}