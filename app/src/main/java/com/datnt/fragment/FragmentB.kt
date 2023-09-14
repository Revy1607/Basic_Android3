package com.datnt.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.findFragment


class FragmentB : Fragment(R.layout.fragment_b) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnA = view.findViewById<Button>(R.id.btnToFragmentA)
        btnA.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.fragment_container, FragmentC())
                .commit()
        }
    }

}