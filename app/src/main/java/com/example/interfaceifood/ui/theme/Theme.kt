package com.example.interfaceifood.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val VermelhoIfood = Color(0xFFEA1D2C)

@Composable
fun InterfaceIfoodTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = lightColorScheme(primary = VermelhoIfood),
        content = content
    )
}