package com.example.complexevent

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val edit: EditText = findViewById(R.id.editTextText)
        val check: CheckBox = findViewById(R.id.checkBox)
        val text: TextView = findViewById(R.id.textView)
        val progress: ProgressBar = findViewById(R.id.progressBar)

        val button: Button = findViewById(R.id.button_ok)
        button.setOnClickListener {
            if (check.isChecked) {
                text.setText(edit.text)
            }
            progress.setProgress(progress.progress + 10)
        }
    }
}