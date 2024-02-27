package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlin_composequadrant.ui.theme.KotlinComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinComposeQuadrantTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrantApp()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp() {
    Column(Modifier.fillMaxWidth()) {
        // First Row: Text composable and Image composable
        Row(Modifier.weight(1f)) { // Each Row occupies an equal portion of available vertical space
            ComposableInfoCard(
                title = "Text composable",
                description = "Displays text and follows the recommended Material Design guidelines.\n",
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f) // Each composable occupies an equal portion of the Row
            )
            ComposableInfoCard(
                title = "Image composable",
                description = "Creates a composable that lays out and draws a given Painter class object.\n",
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f) // Each composable occupies an equal portion of the Row
            )
        }
        // Second Row: Row composable and Column composable
        Row(Modifier.weight(1f)) { // Each Row occupies an equal portion of available vertical space
            ComposableInfoCard(
                title = "Row composable",
                description = "A layout composable that places its children in a horizontal sequence.\n",
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f) // Each composable occupies an equal portion of the Row
            )
            ComposableInfoCard(
                title = "Column composable",
                description = "A layout composable that places its children in a vertical sequence.",
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f) // Each composable occupies an equal portion of the Row
            )
        }
    }
}

@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantAppPreview() {
    KotlinComposeQuadrantTheme {
        ComposeQuadrantApp()
    }
}