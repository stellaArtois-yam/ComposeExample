package com.example.composeexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.main_text)
        textView.text = "Hello Kotlin World"

        val button = findViewById<Button>(R.id.main_button)
        button.text = "Submit"
        button.setOnClickListener{
            val intent = Intent(this, UseCompose::class.java)
            startActivity(intent)

        }


    }







}