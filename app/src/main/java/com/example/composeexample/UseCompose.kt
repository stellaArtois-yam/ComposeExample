package com.example.composeexample

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.Button


import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class UseCompose : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent{
            MyScreenContent()
        }

    }

    @Preview
    @Composable
    fun MyScreenContent(){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "title")

            Text(
                text = "Welcome to Jetpack Compose!",
                style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Button(
                onClick = { startLayerActivity() },
                modifier = Modifier.padding(bottom = 8.dp)
            ) {
                Text(text = "click me!")
            }
            Text(text = "실시간으로 적용이 되는 Compose")
        }
    }

    fun startLayerActivity(){
        val intent = Intent(this, ShowMoreLayer::class.java)
        startActivity(intent)
    }




}