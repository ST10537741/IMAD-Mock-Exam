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



        // Fetch data sent from previous activity using intent
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

            var counter = 0 // initialise counter variable by giving it a starting value of zero
            var weatherDisplay = "" // initialise the variable with an empty string
            while (counter < 5) { // loop through the array a set number of times, sentinel value is 5
                weatherDisplay += "Day: ${daysOfWeek?.get(counter)}\n" // loop through each index of the daysOfWeek array and display its contents
                weatherDisplay += "Min Temperature: ${minTemperatures?.get(counter)}\n" // loop through each index of the minTemperatures array and display its contents
                weatherDisplay += "Max Temperature: ${maxTemperatures?.get(counter)}\n" // loop through each index of the maxTemperatures array and display its contents
                weatherDisplay += "Weather Condition: ${weatherConditions?.get(counter)}\n" // loop through each index of the weatherConditions array and display its contents
                weatherDisplay += "Detailed Weather: ${detailedWeather[counter]}\n\n" // loop through each index of the detailedWeather array and display its contents
                counter++ // increment the counter by 1 with every loop iteration, ends when sentinel value is reached


            }
            txtWeather.text = weatherDisplay // display the contents of the loops in the text view

        }

        // use intent to send user back to the splash screen upon button click
        btnBack.setOnClickListener {
            val intent = Intent(this, SplashScreen::class.java)
            startActivity(intent)
        }


    }

















    }
