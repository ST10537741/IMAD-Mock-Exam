package com.example.arrayicetask1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
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
        val lottieFullScreen = findViewById<LottieAnimationView>(R.id.lottieFullScreen)


        btnTemp.setOnClickListener {

            var total = 0 // initialise the variable with starting number of zero
            for (temp in maxTemperatures) { //loop through the maxTemperatures array
                total += temp // add the value of each index and tally it into the "temp" variable
            }

            val average = total / maxTemperatures.size // divide the total by the number of elements in the array

            txtOutput.text = "Weather Breakdown for the week\nAverage: $average\nHighest: ${maxTemperatures.max()}"
            lottieFullScreen.visibility = View.VISIBLE
            lottieFullScreen.playAnimation()

            // Hide animation after it finishes playing
            lottieFullScreen.postDelayed({
                lottieFullScreen.visibility = View.GONE
            }, 3000)
        }


        // use intent to send data to the next screen
        btnDetailedResults.setOnClickListener {
            val intent = Intent(this, ResultsScreen::class.java)
            intent.putExtra("minTemperatures", minTemperatures)
            intent.putExtra("maxTemperatures", maxTemperatures)
            intent.putExtra("weatherConditions", weatherConditions)
            intent.putExtra("daysOfWeek", daysOfWeek)
            startActivity(intent)
            finish() // finish the current activity to prevent going back to it and sends user to the next screen


        }


        }
    }
