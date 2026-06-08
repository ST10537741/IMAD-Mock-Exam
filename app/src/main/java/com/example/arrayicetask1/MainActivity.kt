package com.example.arrayicetask1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

val minTemperatures = intArrayOf(12, 15, 10, 18, 16)
val maxTemperatures = intArrayOf(25, 30, 22, 28, 26)
val daysOfWeek = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
val weatherConditions = arrayOf("Cloudy", "Sunny", "Rainy", "Sunny", "Windy")


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val btnTemp = findViewById<Button>(R.id.btnTemp)
        val txtOutput = findViewById<TextView>(R.id.txtOutput)
        val btnDetailedResults = findViewById<Button>(R.id.btnDetailedResults)


        btnTemp.setOnClickListener {

            var total = 0
            for (temp in maxTemperatures) {
                total += temp
            }

            val average = total / maxTemperatures.size

            txtOutput.text = "Average: $average\nHighest: ${maxTemperatures.max()}"

        }



        btnDetailedResults.setOnClickListener {
            val intent = Intent(this, ResultsScreen::class.java)
            intent.putExtra("minTemperatures", minTemperatures)
            intent.putExtra("maxTemperatures", maxTemperatures)
            intent.putExtra("weatherConditions", weatherConditions)
            intent.putExtra("daysOfWeek", daysOfWeek)
            startActivity(intent)
            finish()


        }


        }
    }
