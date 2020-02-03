package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Activity_Explore : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__explore)


        // Return arrow button sur la page Explore
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}
