package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)

        val rollButton: Button = findViewById(R.id.roll_button)
//        val countButton: Button = findViewById(R.id.count_up_button)
        val resetButton: Button = findViewById(R.id.reset_button)

        rollButton.setOnClickListener { rollDice() }
//        countButton.setOnClickListener { countUp() }
        resetButton.setOnClickListener { resetText() }

    }

    private fun rollDice(){
//        Toast.makeText(this, "button clicked",
//            Toast.LENGTH_SHORT).show()
        val randomInt = (1..6).random()

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
    }

//    private fun countUp(){
//        val resultText: TextView = findViewById(R.id.result_text)
//        try {
//            var resultInt = resultText.text.toString().toInt()
//            if (resultInt < 6){
//                resultInt++
//                resultText.text = resultInt.toString()
//            }
//
//    } catch (e: NumberFormatException){
//            resultText.text = "1"
//        }
//    }
//
    private fun resetText(){
    diceImage.setImageResource(R.drawable.empty_dice)
    }
}
