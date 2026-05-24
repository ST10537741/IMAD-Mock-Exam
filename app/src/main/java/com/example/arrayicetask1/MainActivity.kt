package com.example.arrayicetask1

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


        btnTemp.setOnClickListener {

            val mintemperatures = arrayOf(12, 15, 10, 18, 16)
            val maxtemperatures = arrayOf(25, 30, 22, 28, 26)
            val weatherconditions = arrayOf("Cloudy", "Sunny", "Rainy", "Sunny", "Windy")
         var result = "25\n 30\n 22\n 28\n 26" 



            var total = 0
            for (temp in maxtemperatures) {
                total += temp
            }

            val average = total / maxtemperatures.size

            txtOutput.text = "$result\nTotal: $total\nAverage: $average\nHighest: ${maxtemperatures.max()}"
        }
        }
    }
