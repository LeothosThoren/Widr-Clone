package com.leothos.widr_clone.data

import com.leothos.widr_clone.models.MessageItem

object DummyData {
    val messageItem: MutableList<MessageItem> = mutableListOf()

    init {

        val firstItem = MessageItem(
            "Edwidge Arnaud",
            "There are millions of users, and there will be helping me",
            "11:24 AM", "Graphic Designer - 2D Artist", "Havana",
            "https://randomuser.me/api/portraits/women/35.jpg"
        )
        messageItem.add(firstItem)
        val scdItem = MessageItem(
            "Lubosek Hnilo",
            "There is a lot of exciting stuff going on in the city",
            "12 Jan", "Déménagement avec camion", "Algiers",
            "https://randomuser.me/api/portraits/women/32.jpg"
        )
        messageItem.add(scdItem)
        val thdItem = MessageItem(
            "Chukwudi Udo",
            "There is a lot of exciting stuff going on in the city",
            "12 Jan", "Déménagement avec camion", "Cali",
            "https://randomuser.me/api/portraits/women/50.jpg"
        )
        messageItem.add(thdItem)
        val frthItem = MessageItem(
            "Jason Bailey",
            "There is a lot of exciting stuff going on in the city",
            "12 Jan", "Déménagement avec camion", "Incheron",
            "https://randomuser.me/api/portraits/men/58.jpg"
        )
        messageItem.add(frthItem)
        val fithItem = MessageItem(
            "Rahul Malviya",
            "There is a lot of exciting stuff going on in the city",
            "12 Jan", "Déménagement avec camion", "Bangalore",
            "https://randomuser.me/api/portraits/men/40.jpg"
        )
        messageItem.add(fithItem)
        val sixItem = MessageItem(
            "Igor Antonovich",
            "There is a lot of exciting stuff going on in the city",
            "12 Jan", "Déménagement avec camion", "Turin",
            "https://randomuser.me/api/portraits/men/17.jpg"
        )
        messageItem.add(sixItem)
    }
}