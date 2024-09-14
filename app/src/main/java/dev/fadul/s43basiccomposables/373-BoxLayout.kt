package dev.fadul.s43basiccomposables

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.Alignment.Companion.Start as Start1

class MainActivity373 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            S43BasicComposablesTheme {
                Surface(
                    modifier = Modifier.padding(0.dp, 25.dp),
                    color = Color.White
                ) {
                    Greeting373()
                }
            }
        }
    }
}

@Composable
fun Greeting373() {
    // We can use the align modifier to specify
    // where the composables should be drawn

    // Box - use case 1
//    Box(modifier = Modifier.fillMaxSize())
//        Text(text = "Hello John")
//        Text(text = "Hello Mary")

    // Box - use case 2
    Box(modifier = Modifier.width(100.dp).background(Color.Red).fillMaxHeight())
    Text(text = "Hello John")
    Box(Modifier.width(30.dp).background(Color.Cyan).fillMaxHeight())
    Text(text = "Hello Mary", modifier = Modifier.padding(0.dp, 200.dp))
}


