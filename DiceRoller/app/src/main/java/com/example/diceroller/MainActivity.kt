package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val countButton: Button = findViewById(R.id.count_up_button)
        val resetButton: Button = findViewById(R.id.reset_button)

        rollButton.setOnClickListener { rollDice() }
        countButton.setOnClickListener { countUp() }
        resetButton.setOnClickListener { resetText() }

    }

    private fun rollDice(){
//        Toast.makeText(this, "button clicked",
//            Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    private fun countUp(){
        val resultText: TextView = findViewById(R.id.result_text)
        try {
            var resultInt = resultText.text.toString().toInt()
            if (resultInt < 6){
                resultInt++
                resultText.text = resultInt.toString()
            }

    } catch (e: NumberFormatException){
            resultText.text = "1"
        }
    }

    private fun resetText(){
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "0"
    }
}
