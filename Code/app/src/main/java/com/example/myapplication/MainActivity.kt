package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.GridLayout

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    // Affiche les trois petits points du menu en haut à droite de l'écran
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.bottom_menu, menu)
        return true
    }

    //Permet la connexion entre les onglets du menu et la page Explore, Profile & Favorite
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        if (id == R.id.Explore) {
            val myintent = Intent(this@MainActivity, Activity_Explore::class.java)
            startActivity(myintent)
            return true
        }

        if (id == R.id.Profile) {
            val myintent = Intent(this@MainActivity, Activity_Profile::class.java)
            startActivity(myintent)
            return true
        }


        if (id == R.id.Favorite) {
            val myintent = Intent(this@MainActivity, Activity_Favorite::class.java)
            startActivity(myintent)
            return true
        }

        if (id == R.id.Maps) {
            val myintent = Intent(this@MainActivity, Activity_Maps::class.java)
            startActivity(myintent)
            return true
        }

        return super.onOptionsItemSelected(item)
    }


}
