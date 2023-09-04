package com.example.composeexample

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


class ShowMoreLayer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent{
            MyApp()
        }
    }

    @Composable
    fun MyApp() {
        var isBlue by remember { mutableStateOf(false) }

        Column( // 세로 정렬 컬럼
            modifier = Modifier.fillMaxSize(), // Modifier : 레이아웃 및 스타일 지정 속성
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Like this !!!")


            Row(
                modifier = Modifier.padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(Icons.Default.Person, contentDescription = "User Icon")
                Text(text = "Jayden")
                Spacer(modifier = Modifier.width(16.dp))
                Button(onClick = { isBlue = !isBlue }) {
                    Text(text = "Change")
                }
            }

            ColorChangingBox(isBlue)


        }
    }

    @Composable
    fun ColorChangingBox(isBlue: Boolean) {

        Box(
            modifier = Modifier
                .size(200.dp)
                .background(if (isBlue) Color.Blue else Color.Red),
            contentAlignment = Alignment.Center
        ){
            Text(text = "hi guys", color = Color.White)
        }
    }

}