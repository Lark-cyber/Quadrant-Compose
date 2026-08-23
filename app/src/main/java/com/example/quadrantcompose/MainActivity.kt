package com.example.quadrantcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrantcompose.ui.theme.QuadrantComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantComposeTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Display()
                }
            }
        }
    }
}

@Composable
fun QuadrantCompose(
    title: String,
    description: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = description,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun Display(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row(modifier = Modifier.weight(1f)) {
            QuadrantCompose(
                title = stringResource(R.string.title1),
                description = stringResource(R.string.description1),
                modifier = Modifier.weight(1f).fillMaxHeight().background(Color(0xFFEADDFF)).padding(16.dp)
            )
            QuadrantCompose(
                title = stringResource(R.string.title2),
                description = stringResource(R.string.description2),
                modifier = Modifier.weight(1f).fillMaxHeight().background(Color(0xFFD0BCFF)).padding(16.dp)
            )
        }
        Row(modifier = Modifier.weight(1f)) {
            QuadrantCompose(
                title = stringResource(R.string.title3),
                description = stringResource(R.string.description3),
                modifier = Modifier.weight(1f).fillMaxHeight().background(Color(0xFFB69DF8))
                    .padding(16.dp)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DisplayPreview() {
    QuadrantComposeTheme {
        Display()
    }
}