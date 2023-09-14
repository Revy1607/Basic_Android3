package com.datnt.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    private var btnFragmentE: Button? = null
    private var btnFragmentD: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnFragmentE = findViewById(R.id.btnFragmentE)
        btnFragmentD = findViewById(R.id.btnFragmentD)

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container1, FragmentD()).commit()

        btnFragmentD?.setOnClickListener {
            val fragmentD = FragmentD()
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container1, fragmentD)
                .commit()
        }
        btnFragmentE?.setOnClickListener {
            val fragmentE = FragmentE()
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container1, fragmentE)
                .commit()
        }
    }
}