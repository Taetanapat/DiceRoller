package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice() }

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "Dice Rolled!"

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { reset() }


    }
    private fun reset(){
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "0"
    }
    private fun rollDice(){
        val randomInt = java.util.Random().nextInt(6)+1
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
        Toast.makeText(this,"Button clicked",Toast.LENGTH_SHORT).show()
    }
}
