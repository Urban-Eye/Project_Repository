package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu


class Activity_Profile_Edit : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_profile_edit)
                // Return arrow button sur la page Explore
                supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        }

}