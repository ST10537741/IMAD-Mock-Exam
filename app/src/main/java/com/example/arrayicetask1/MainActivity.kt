package com.example.arrayicetask1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val btnTemp = findViewById<Button>(R.id.btnTemp)
        val txtOutput = findViewById<TextView>(R.id.txtOutput)
        val btnDetailedResults = findViewById<Button>(R.id.btnDetailedResults)
        val weatherTextView = findViewById<TextView>(R.id.weatherTextView)


        btnTemp.setOnClickListener {

            val minTemperatures = arrayOf(12, 15, 10, 18, 16)
            val maxTemperatures = arrayOf(25, 30, 22, 28, 26)
            val daysOfWeek = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
            val weatherConditions = arrayOf("Cloudy", "Sunny", "Rainy", "Sunny", "Windy")

            var counter = 0
            var weatherDisplay = ""
            while (counter < 5) {
                weatherDisplay += "Day: ${daysOfWeek[counter]}\n"
                weatherDisplay += "Min Temperature: ${minTemperatures[counter]}\n"
                weatherDisplay += "Max Temperature: ${maxTemperatures[counter]}\n"
                weatherDisplay += "Weather Condition: ${weatherConditions[counter]}\n\n"
                counter++

                weatherTextView.text = weatherDisplay

            }

            var total = 0
            for (temp in maxTemperatures) {
                total += temp
            }

            val average = total / maxTemperatures.size

            txtOutput.text = "Total:$total\nAverage: $average\nHighest: ${maxTemperatures.max()}"
        }

        btnDetailedResults.setOnClickListener {
            val intent = Intent(this, ResultsScreen::class.java)
            startActivity(intent)
        }
        }
    }
