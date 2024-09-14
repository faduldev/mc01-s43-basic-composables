package dev.fadul.s43basiccomposables

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import dev.fadul.s43basiccomposables.ui.theme.S43BasicComposablesTheme

class MainActivity369 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            S43BasicComposablesTheme {
                // Setting a List
                val users = listOf("User1", "User2", "User3", "User4")
                // Sending a List
                Challenge369(users)
            }
        }
    }
}

@Composable
// Receiving a List
fun Challenge369(names: List<String>) {
    Column() {
        for (name in names) {
            Text(
                text = "Hello $name!",
                color = Color.Blue
            )
        }
    }

}
