package com.example.arrayicetask1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ResultsScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.results_screen)

        val btnBack = findViewById<Button>(R.id.btnBack)
        val btnWeather = findViewById<Button>(R.id.btnWeather)


        btnBack.setOnClickListener {
            finish()
        }
    }

















    }
}