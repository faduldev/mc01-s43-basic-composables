package dev.fadul.s43basiccomposables

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.fadul.s43basiccomposables.ui.theme.S43BasicComposablesTheme
import androidx.compose.ui.Alignment.Companion.Start as Start1

class MainActivity377 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            S43BasicComposablesTheme {
                Surface(
                    modifier = Modifier.padding(0.dp, 25.dp),
                    color = Color.White
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting377() {
    // Displaying Images
    Image(
        painter = painterResource(id = R.drawable.tiger),
        contentDescription = "Tiger",
        modifier = Modifier
            .size(400.dp)
            .clip(CircleShape)
            .border(width = 5.dp,
                color = Color.Red,
                shape = CircleShape
            )
            // Customizing the image
            .scale(0.6f)                 // Reduce the size of the image
            .aspectRatio(16f/9f)    // Change the aspect ratio
            .blur(                       // Blur effect
                radiusX = 10.dp,
                radiusY = 10.dp,
                edgeTreatment = BlurredEdgeTreatment.Unbounded),
        contentScale = ContentScale.Crop // Content scale
    )
}


