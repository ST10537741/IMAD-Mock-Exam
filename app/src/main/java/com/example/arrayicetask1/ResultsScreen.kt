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


        btnWeather.setOnClickListener {
            val minTemperatures = intent.getIntArrayExtra("minTemperatures")
            val maxTemperatures = intent.getIntArrayExtra("maxTemperatures")
            val weatherConditions = intent.getStringArrayExtra("weatherConditions")
            val daysOfWeek = intent.getStringArrayExtra("daysOfWeek")
            val detailedWeather = arrayOf("Cool, cloudy weather in the morning but warms up in the afternoon, low chance of rain.",
                                          "Warm, sunny day, clear blue skies. Temperatures will remain moderate throughout the day",
                                          "Cold, rainy day. Rain will begin late morning and persist until the evening.",
                                          "Warm, sunny day, clear blue skies. Temperatures will remain moderate throughout the day",
                                          "Warm, moderate temperatures throughout the day, no rain expected but expect strong and persistent gusts of wind.")

            var counter = 0
            var weatherDisplay = ""
            while (counter < 5) {
                weatherDisplay += "Day: ${daysOfWeek?.get(counter)}\n"
                weatherDisplay += "Min Temperature: ${minTemperatures?.get(counter)}\n"
                weatherDisplay += "Max Temperature: ${maxTemperatures?.get(counter)}\n"
                weatherDisplay += "Weather Condition: ${weatherConditions?.get(counter)}\n"
                weatherDisplay += "Detailed Weather: ${detailedWeather[counter]}\n\n"
                counter++
                 txtWeather.text = weatherDisplay

            }





        }


    }

















    }
