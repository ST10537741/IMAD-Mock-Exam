package com.example.arrayicetask1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ResultsScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.results_screen)

        val btnBack = findViewById<Button>(R.id.btnBack)
        val btnWeather = findViewById<Button>(R.id.btnWeather)
        val txtWeather = findViewById<TextView>(R.id.txtWeather)
        val txtOutput = findViewById<TextView>(R.id.txtOutput)




        btnBack.setOnClickListener {
            intent = Intent(this, SplashScreen::class.java)
            startActivity(intent)
        }
        btnWeather.setOnClickListener {
            val minTemperatures = intent.getIntArrayExtra("minTemperatures")
            val maxTemperatures = intent.getIntArrayExtra("maxTemperatures")
            val weatherConditions = intent.getStringArrayExtra("weatherConditions")
            val day = intent.getStringExtra("day")


            txtWeather.text = "$day\n$minTemperatures\n$maxTemperatures\n$weatherConditions"


        }


    }

















    }
