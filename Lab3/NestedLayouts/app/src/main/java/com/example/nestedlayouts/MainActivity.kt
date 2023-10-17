package com.example.nestedlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)

        val textUp1: TextView = findViewById(R.id.upper_1)
        val textUp2: TextView = findViewById(R.id.upper_2)
        val textUp3: TextView = findViewById(R.id.upper_3)

        val textMid1: TextView = findViewById(R.id.middle_1)
        val textMid2: TextView = findViewById(R.id.middle_2)
        val textMid3: TextView = findViewById(R.id.middle_3)

        val textDown1: TextView = findViewById(R.id.bottom_1)
        val textDown2: TextView = findViewById(R.id.bottom_2)
        val textDown3: TextView = findViewById(R.id.bottom_3)

        button.setOnClickListener {
            if (!textUp1.text.isEmpty()) {
                val newtext: Int = textUp1.text.toString().toInt() + 1
                textUp1.setText("")
                textUp2.setText(newtext.toString())

                textMid1.setText("")
                textMid2.setText(newtext.toString())

                textDown1.setText("")
                textDown2.setText(newtext.toString())
            }
            else if (!textUp2.text.isEmpty()) {
                val newtext: Int = textUp2.text.toString().toInt() + 1
                textUp2.setText("")
                textUp3.setText(newtext.toString())

                textMid2.setText("")
                textMid3.setText(newtext.toString())

                textDown2.setText("")
                textDown3.setText(newtext.toString())
            }
            else if (!textUp3.text.isEmpty()) {
                val newtext: Int = textUp3.text.toString().toInt() + 1
                textUp3.setText("")
                textUp1.setText(newtext.toString())

                textMid3.setText("")
                textMid1.setText(newtext.toString())

                textDown3.setText("")
                textDown1.setText(newtext.toString())
            }
        }
    }
}