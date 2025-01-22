package com.example.ex_kotlin_pract7.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val CustomLightColorScheme = lightColorScheme(
    primary = PrimaryColor,
    secondary = SecondaryColor,
    background = BackgroundColor,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = TextColor
)

@Composable
fun Ex_kotlin_pract7Theme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = CustomLightColorScheme,
        typography = Typography,
        content = content
    )
}
