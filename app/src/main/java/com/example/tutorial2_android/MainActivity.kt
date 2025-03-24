package com.example.tutorial2_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.tutorial2_android.ui.theme.Tutorial2_androidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tutorial2_androidTheme {
                val color = "Green"
                trafficLight(color)
            }
        }
    }
}

@Composable
fun trafficLight(color: String) {
    when(color) {
        "Red" -> Signal("Stop", Color.Red)
        "Yellow" -> Signal("Slow", Color.Yellow)
        "Green" -> Signal("Go", Color.Green)
        else -> Signal("Invalid traffic-light color", Color.Gray)
    }
}

@Composable
fun Signal(message: String, color: Color) {
    Text(
        text = message,
        color = color
    )
}


