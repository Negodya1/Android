package com.example.logging

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import android.util.Log
import android.widget.EditText
import timber.log.Timber

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Timber.plant(Timber.DebugTree())

        val button: Button = findViewById(R.id.button_log)
        val button2: Button = findViewById(R.id.button_timber)

        val editText: EditText = findViewById(R.id.editTextText)

        button.setOnClickListener {
            Log.v("From EditText", editText.text.toString())
        }

        button2.setOnClickListener {
            Timber.v(editText.text.toString())
        }
    }
}