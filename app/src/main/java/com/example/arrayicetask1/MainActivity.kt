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
        val weatherEditView = findViewById<TextView>(R.id.weatherEditView)


        btnTemp.setOnClickListener {

            val minTemperatures = arrayOf(12, 15, 10, 18, 16)
            val maxTemperatures = arrayOf(25, 30, 22, 28, 26)
            val weatherConditions = arrayOf("Cloudy", "Sunny", "Rainy", "Sunny", "Windy")
         var result = "25\n 30\n 22\n 28\n 26"

            val day = weatherEditView.text.toString()
            when (day) {
                "Monday" -> weatherEditView.text = "$minTemperatures[0]\n$maxTemperatures[0]\n$weatherConditions[0]"
                "Tuesday" -> weatherEditView.text = "$minTemperatures[1]\n$maxTemperatures[1]\n$weatherConditions[1]"
                "Wednesday" -> weatherEditView.text = "$minTemperatures[2]\n$maxTemperatures[2]\n$weatherConditions[2]"
                "Thursday" -> weatherEditView.text = "$minTemperatures[3]\n$maxTemperatures[3]\n$weatherConditions[3]"
                "Friday" -> weatherEditView.text = "$minTemperatures[4]\n$maxTemperatures[4]\n$weatherConditions[4]"
            }



            var total = 0
            for (temp in maxTemperatures) {
                total += temp
            }

            val average = total / maxTemperatures.size

            txtOutput.text = "$total\nAverage: $average\nHighest: ${maxTemperatures.max()}"
        }

        btnDetailedResults.setOnClickListener {
            val intent = Intent(this, ResultsScreen::class.java)
            startActivity(intent)
        }
        }
    }
