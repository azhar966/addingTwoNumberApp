package com.zebdul.twonumbersadd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputA = findViewById<EditText>(R.id.inputA)
        val inputB = findViewById<EditText>(R.id.inputB)
        val button = findViewById<Button>(R.id.button)
        val resultView = findViewById<TextView>(R.id.result)

        button.setOnClickListener {
            val inputAGet = inputA.text.toString().toInt()
            val inputBGet = inputB.text.toString().toInt()
            val result = inputAGet + inputBGet
            resultView.text = result.toString()

            Toast.makeText(this, "Addition of $inputAGet and $inputBGet is $result",
                Toast.LENGTH_SHORT ).show()
        }    }  }