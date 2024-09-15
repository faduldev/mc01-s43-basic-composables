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

class MainActivity374 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            S43BasicComposablesTheme {
                Surface(
                    modifier = Modifier.padding(0.dp, 25.dp),
                    color = Color.White
                ) {
                    Greeting374()
                }
            }
        }
    }
}
/*
* Arrangement - refers to how the layout children are laid out on the main axis
* - vertical for Column and horizontal for Row.
*
* Alignment does the same, but on the cross axis
* - horizontal for Column and vertical for Row.
*
* The following is a list of alignment values accepted by the Row vertical
* alignment parameter:
* - Alignment.Top - ALigns the content at the top of the Row content area
* - Alignment.CenterVertically - Positions the content in the vertical center
* of the Row content area
* - Alignment.Botton - Aligns the content at the bottom of the Row content area
*
* When working with the Column composable, the horizontalAlignment parameter is used
* to configure alignment along the horizontal axis. Acceptable values are as follows:
* - Alignment.Start - Aligns the content at the horizontal start of the Column content area
* - Alignment.CenterHorizontally - Positions the content in the horizontal center of the
* Column content area
* - Alignment.End - Aligns the content at the horizontal end of the Column content area
*
* Row component via the horizontalArrangement parameter:
* - Arrangement.Start
* - Arrangement.Center
* - Arrangement.End
*
* Column composables accepts the following values for the verticalArrangement:
* - Arrangement.Top
* - Arrangement.Center
* - Arrangement.Bottom
*/
@Composable
fun Greeting374() {

}


