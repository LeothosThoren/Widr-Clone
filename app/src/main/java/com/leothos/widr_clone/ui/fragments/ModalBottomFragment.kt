package com.leothos.widr_clone.ui.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.leothos.widr_clone.R
import kotlinx.android.synthetic.main.fragment_modal_bottom.*

class ModalBottomFragment : BottomSheetDialogFragment() {

    fun newInstance(): ModalBottomFragment {
        return ModalBottomFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_modal_bottom, container, false)
        return view
    }

    override fun onResume() {
        super.onResume()
        dismissModalWindow.setOnClickListener { dialog.dismiss() }
    }


}
