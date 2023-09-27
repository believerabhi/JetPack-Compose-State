package com.example.jetpack.compose.state.ui.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
   WaterCounter()
}

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    val count = 2
    Text(text = "You have had $count glasses water today",
         modifier = Modifier.padding(16.dp)
    )
}