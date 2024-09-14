package dev.fadul.s43basiccomposables

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.ui.unit.sp
import dev.fadul.s43basiccomposables.ui.theme.S43BasicComposablesTheme

class MainActivity368 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            S43BasicComposablesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DisplayOurText()
                }
            }
        }
    }
}

@Composable
fun DisplayOurText() {
    //Container para seleção de texto
    SelectionContainer {
        // Parameters that define the appearence and behavior of Text Composable
        Text(
            text = stringResource(R.string.welc_msg),
            color = Color.Blue,
            fontSize = 48.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            style = TextStyle(textDecoration = TextDecoration.LineThrough),
            lineHeight = 40.sp,
            letterSpacing = 2.sp,
            fontFamily = FontFamily.Cursive,
            maxLines = 3,
            overflow = TextOverflow.Ellipsis   // Sinal de continuação ...

        )
    }
}