package dev.fadul.s43basiccomposables

import android.os.Bundle
import android.widget.Toast
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.fadul.s43basiccomposables.ui.theme.S43BasicComposablesTheme
import androidx.compose.ui.Alignment.Companion.Start as Start1

class MainActivity375 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            S43BasicComposablesTheme {
                Surface(
                    modifier = Modifier.padding(0.dp, 25.dp),
                    color = Color.White
                ) {
                    Greeting375()
                }
            }
        }
    }
}
/*
* Button is a UI element that a user interact with
* by clicking or tapping it
*/
@Composable
fun Greeting375() {
    val context = LocalContext.current.applicationContext
    Column() {  // Optional
        Button(
            onClick =
            {
                // Lambda expression or Block or Function or Things be executed
                Toast.makeText(
                    // 1-context, 2-message, 3-length_duration
                    context,
                    "You clicked the Button",
                    Toast.LENGTH_SHORT
                ).show()
            },
            // Customize the button shape using the
            // shape/colors/elevation parameters
            shape = RoundedCornerShape(size = 20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Green),
            elevation = ButtonDefaults.buttonElevation(20.dp),
            // Changing size
            modifier = Modifier
                //.fillMaxWidth()
                .width(200.dp)
                .height(40.dp)
        ) {
            Text(text = "Click Me")
        }
    }

}


