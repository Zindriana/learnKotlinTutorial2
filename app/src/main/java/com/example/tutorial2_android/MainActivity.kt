package com.example.tutorial2_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.tutorial2_android.ui.theme.Tutorial2_androidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tutorial2_androidTheme {

                val color = "green"
                val number = 11
                Column(
                    modifier = Modifier.padding(
                        WindowInsets.systemBars
                            .asPaddingValues()
                    )
                ) {
                    trafficLight(color)
                    isNumberHigh(number)
                }

            }
        }
    }
}

@Composable
fun trafficLight(color: String) {
    when(color) {
        "Red", "red", "pink" -> Signal("Stop", Color.Red)
        "Yellow", "yellow", "Orange" -> Signal("Slow", Color.Yellow)
        "Green", "torques", "cyan","blue", "green" -> Signal("Go", Color.Green)
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

@Composable
fun isNumberHigh(number: Int){
    when {
        number in 1..9 -> Signal("False", Color.Red)
        number > 9 -> Signal("True", Color.Green)
        else -> Signal("Neither", Color.Black)
    }
}


