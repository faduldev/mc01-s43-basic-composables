package dev.fadul.s43basiccomposables

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.fadul.s43basiccomposables.ui.theme.S43BasicComposablesTheme

class MainActivity372 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            S43BasicComposablesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize().padding(0.dp, 25.dp),
                    color = Color.Transparent
                ) {
                    Greeting372()
                }
            }
        }
    }
}

@Composable
fun Greeting372() {
    // Column - use case 1
//    Column(horizontalAlignment = Alignment.CenterHorizontally) {
//        Text(text = "Hello John")
//        Text(text = "Hello Mary")
//    }

    // Column - use case 2
//    Column() {
//        Text(text = "Hello John")
//        Text(text = "Hello Mary", modifier = Modifier.align(Alignment.CenterHorizontally))
//    }

    // Column - use case 3
//    Column(verticalArrangement = Arrangement.Center) {
//        Text(text = "Hello John")
//        Text(text = "Hello Mary")
//    }

    // Row - use case 1
//    Row() {
//        Text(text = "Hello John")
//        Text(text = "Hello Mary")
//    }

    // Row - use case 2
    Row(horizontalArrangement = Arrangement.Center) {
        Text(text = "Hello John")
        Text(text = "Hello Mary")
    }
}


