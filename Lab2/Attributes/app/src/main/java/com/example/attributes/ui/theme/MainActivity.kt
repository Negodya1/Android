package com.example.attributes

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val editText: EditText = findViewById(R.id.editTextText2)

        val button: Button = findViewById(R.id.button_color1)
        button.setOnClickListener {
            editText.setTextColor(Color.BLACK)
        }

        val button2: Button = findViewById(R.id.button_color2)
        button2.setOnClickListener {
            editText.setTextColor(Color.RED)
        }

        val button3: Button = findViewById(R.id.button_size1)
        button3.setOnClickListener {
            editText.setTextSize(8.0F)
        }

        val button4: Button = findViewById(R.id.button_size2)
        button4.setOnClickListener {
            editText.setTextSize(24.0F)
        }

        val button5: Button = findViewById(R.id.button_back1)
        button5.setOnClickListener {
            editText.setBackgroundColor(Color.WHITE)
        }

        val button6: Button = findViewById(R.id.button_back2)
        button6.setOnClickListener {
            editText.setBackgroundColor(Color.YELLOW)
        }
    }
}