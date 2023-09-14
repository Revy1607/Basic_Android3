package com.datnt.fragment

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class FragmentA : Fragment(R.layout.fragment_a) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnB = view.findViewById<Button>(R.id.btnToFragmentB)
        btnB.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.fragment_container, FragmentB())
                .commit()
        }
        val toActivity2 = view.findViewById<Button>(R.id.toActivity2)
        toActivity2.setOnClickListener {
            val intent = Intent(activity, MainActivity2::class.java)
            startActivity(intent)
        }
    }

}