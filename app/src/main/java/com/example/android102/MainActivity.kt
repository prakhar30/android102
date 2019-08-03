package com.example.android102

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun doneButtonPressed(view: View) {
        val edit = findViewById<EditText>(R.id.editText)
        val value = edit.text.toString()
        val label = findViewById<TextView>(R.id.textView)
        label.text = value
    }
}
