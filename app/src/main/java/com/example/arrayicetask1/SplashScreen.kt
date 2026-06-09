package com.example.arrayicetask1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.splash_screen)

        val btnContinue = findViewById<Button>(R.id.btnContinue)
        val welcomeTextView = findViewById<TextView>(R.id.welcomeTextView)
        val btnExit = findViewById<Button>(R.id.btnExit)

        welcomeTextView.text = "Weather"

        // use intent to send user to the main activity upon button click
        btnContinue.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // exit the app upon button click
        btnExit.setOnClickListener {
            finish()
        }

    }



















    }
