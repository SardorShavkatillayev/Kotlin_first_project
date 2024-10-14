package com.example.my_application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.my_application.ui.theme.My_ApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            My_ApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CongratulationCard(
                        message = "1-loyihangiz bilan tabriklaymiz!",
                        signature = "hurmat bilan uu.uz"
                    )
                }
            }
        }
    }
}

@Composable
fun Congratulation(
    message: String,
    signature: String
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize() // Fill entire screen space
    ) {
        Text(
            text = message,
            fontSize = 45.sp,
            lineHeight = 50.sp,
            textAlign = TextAlign.Center
        )

        Text(
            text = signature,
            fontSize = 30.sp,
            modifier = Modifier
                .align(Alignment.End)
                .padding(14.dp),
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun CongraImage() {
    val backImage = painterResource(id = R.drawable.hh_png)
    Image(
        painter = backImage,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize()
    )
}

@Composable
fun CongratulationCard(
    message: String,
    signature: String
) {
    CongraImage()
    Congratulation(message = message, signature = signature)
}

@Preview(showSystemUi = true)
@Composable
fun CongratulationCardPreview() {
    My_ApplicationTheme {
        CongratulationCard(
            message = "1-loyihangiz bilan tabriklaymiz!",
            signature = "hurmat bilan uu.uz"
        )
    }
}
