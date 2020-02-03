package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.getbase.floatingactionbutton.FloatingActionButton

class Activity_Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Return arrow button on the Profile page
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        // Profile floating menu actions
        val fab = findViewById(R.id.edit_profile) as FloatingActionButton
        fab.setOnClickListener {
            val myintent = Intent(this@Activity_Profile, Activity_Profile_Edit::class.java)
            startActivity(myintent)
        }
    }
}