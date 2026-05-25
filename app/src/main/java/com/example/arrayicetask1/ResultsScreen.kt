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



        btnBack.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btnWeather.setOnClickListener {
            val minTemperatures = intent.getIntArrayExtra("minTemperatures")
            val maxTemperatures = intent.getIntArrayExtra("maxTemperatures")
            val weatherConditions = intent.getStringArrayExtra("weatherConditions")

            txtWeather.text = "$minTemperatures\n$maxTemperatures\n$weatherConditions" 


    }

















    }
}