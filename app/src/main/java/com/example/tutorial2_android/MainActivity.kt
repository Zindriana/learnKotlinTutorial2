package com.example.tutorial2_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.tutorial2_android.ui.theme.Tutorial2_androidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tutorial2_androidTheme {
                val num1 = 2
                val num2 = 2
                Main(num1, num2)
            }
        }
    }
}

@Composable
fun Main(num1: Int, num2: Int) {
    if(num1 < num2){
        Text(
            text = "True",
            color = Color(0xFF3ddc84)
        )
    }
    else if(num1 > num2){
        Text(
            text = "False",
            color = Color(0xFF44bb00)
        )
    }
    else {
        Text(
            text = "Equal",
            color = Color(0xFF44bb00)
        )
    }
}

