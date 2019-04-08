package com.leothos.widr_clone.ui.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.leothos.widr_clone.R
import com.leothos.widr_clone.ui.fragments.main_fragment.HeaderFragment
import com.leothos.widr_clone.ui.fragments.main_fragment.MessageFragment
import com.leothos.widr_clone.ui.fragments.main_fragment.NotificationFragment
import com.leothos.widr_clone.ui.fragments.main_fragment.ProfileFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

    }

    //****************
    // Initialization
    //****************

    private fun init() {
        configureFragmentContent(HeaderFragment())
        configureBottomNavigationView()
    }

    //****************
    // Configurations
    //****************

    private fun configureBottomNavigationView() {
        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            updateFragments(menuItem.itemId)
        }

    }

    /**
     * @param fragment
     * This method allow to configure dynamically a fragment to display within the activity,
     * ruled by the bottom navigation view items
     * */
    private fun configureFragmentContent(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frameLayout, fragment)
            .commit()
    }

    //*******************
    // User Interactions
    //*******************

    /**
     * @param item
     * The bottom navigation bar allow the user to select an item.
     * Each items display different contents. The parameter item referrers to the menu item ids
     * */
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
