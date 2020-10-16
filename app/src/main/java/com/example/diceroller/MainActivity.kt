package com.example.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    lateinit var clear: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_img)
        clear = findViewById(R.id.clear_button)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice();
        }
        clear.setOnClickListener {
            diceImage.setImageResource(R.drawable.empty_dice)
        }
    }

    private fun rollDice() {
        val drawableResource = when (getRandomDiceImage()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }

    private fun getRandomDiceImage(): Int {
        return (1..6).random()
    }

}

/* private fun increment() {
     val rollText: TextView = findViewById(R.id.roll_text)
     val gettext: String = rollText.text.toString()
     if (gettext.length == 1) {
         if (Integer.parseInt(gettext) >= 0 && Integer.parseInt(gettext) <= 5) {
             rollText.text = (Integer.parseInt(gettext) + 1).toString()
         }
     } else {
         rollText.text = 1.toString()
     }
 }*/

/* private fun reset() {
     val rollText: TextView = findViewById(R.id.roll_text)
     val gettext: String = rollText.text.toString()
     rollText.text = 0.toString()
 }*/

