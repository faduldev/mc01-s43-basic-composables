package dev.fadul.s43basiccomposables

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextDecoration.Companion.LineThrough
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.fadul.s43basiccomposables.ui.theme.S43BasicComposablesTheme

// The XML attributes
// (id, padding, margin, color, borders, padding, background,
//  size requirements, event handlers, user input,
//  clickable, scrollable, draggable, zoomable,
//  accessibility, gestures, alpha, ratio, elevation, ...)
// are used with the help of modifiers.
//
// Modifier is a built-in Compose Object that provides
// a wide selection of methods that can be applied
// to composables.

class MainActivity370 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            S43BasicComposablesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting370 ("FadulDev")
                }
            }
        }
    }
}

@Composable
fun Greeting370(name: String) {

    // Define a variable for reuse Modifier Method
    val reusableModifier = Modifier.fillMaxSize().background(Color.Red).padding(12.dp)

    val onClick = {}

    // Using Modifier with Column
    Column(
        // Reusing Modifier with Column
        modifier = reusableModifier
    ) {
        Text(
            text = "Hello $name!",
            // Using Modifier with Text
            modifier = Modifier
                .padding(24.dp)
                .background(Color.Yellow)
                .fillMaxSize()
                .clickable(onClick = onClick)

        )
    }
}