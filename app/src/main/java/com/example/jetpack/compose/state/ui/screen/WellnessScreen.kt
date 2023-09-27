package com.example.jetpack.compose.state.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
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
    var count = 0
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "You have had $count glasses water today",
        )   
        Button(onClick = { count++ },
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text(text = "Click here")
        }
    }
}