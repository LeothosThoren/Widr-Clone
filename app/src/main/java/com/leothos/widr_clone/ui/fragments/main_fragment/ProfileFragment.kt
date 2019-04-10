package com.leothos.widr_clone.ui.fragments.main_fragment


import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.leothos.widr_clone.R
import com.leothos.widr_clone.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_profil.*

class ProfileFragment : BaseFragment() {

    override fun getToolbar(): Toolbar {
        return profileToolbar
    }

    override fun getLayoutId(): Int {
        return R.layout.fragment_profil
    }

    override fun onResume() {
        super.onResume()
        Glide.with(this)
            .load("https://randomuser.me/api/portraits/men/58.jpg")
            .apply(RequestOptions.circleCropTransform())
            .into(profilePicture)

        profileName.text = getString(R.string.profile_name)
    }


    //****************
    // Configurations
    //****************

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater?.inflate(R.menu.toolbar_hamburger, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.toolbar_profile_hamburger -> {
                Toast.makeText(activity, "hamburger icon activated", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}
