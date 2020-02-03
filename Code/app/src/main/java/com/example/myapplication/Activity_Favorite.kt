package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Activity_Favorite : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__favorite)

        // Return arrow button on the Favorite page
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}
