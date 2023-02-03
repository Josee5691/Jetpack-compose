package com.example.compose.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.compose.StatefulCounter


@Composable
fun WellnessScreen(modifier: Modifier = Modifier){
    StatefulCounter(modifier = modifier)
}