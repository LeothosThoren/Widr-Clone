package com.leothos.widr_clone.ui.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.leothos.widr_clone.R
import com.leothos.widr_clone.ui.fragments.HeaderFragment
import com.leothos.widr_clone.ui.fragments.MessageFragment
import com.leothos.widr_clone.ui.fragments.NotificationFragment
import com.leothos.widr_clone.ui.fragments.ProfileFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

    }

    private fun init() {
        configureFragmentContent(HeaderFragment())
        configureBottomNavigationView()
    }

    //****************
    // Configurations
    //****************

    private fun configureBottomNavigationView() {
        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem -> updateFragments(menuItem.itemId) }
    }

    private fun configureFragmentContent(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayout, fragment).commit()
    }


    //*******************
    // User Interactions
    //*******************

    private fun updateFragments(item: Int): Boolean {
        when (item) {
            R.id.action_header -> configureFragmentContent(HeaderFragment())
            R.id.action_messages -> configureFragmentContent(MessageFragment())
            R.id.action_add -> Toast.makeText(this, "action add something", Toast.LENGTH_SHORT).show()
            R.id.action_notification -> configureFragmentContent(NotificationFragment())
            R.id.action_profil -> configureFragmentContent(ProfileFragment())
        }
        return true
    }

}
