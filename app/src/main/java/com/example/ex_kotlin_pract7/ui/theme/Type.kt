package com.example.ex_kotlin_pract7.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.ex_kotlin_pract7.R

val CustomFont = FontFamily(
    Font(R.font.roboto_regular, FontWeight.Normal),
    Font(R.font.roboto_bold, FontWeight.Bold)
)

// Обновленные стили текста
val Typography = Typography(
    titleLarge = TextStyle(
        fontFamily = CustomFont,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        color = SecondaryColor
    ),
    bodyLarge = TextStyle(
        fontFamily = CustomFont,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
        lineHeight = 26.sp,
        color = PrimaryColor
    ),
    labelSmall = TextStyle(
        fontFamily = CustomFont,
        fontWeight = FontWeight.Light,
        fontSize = 12.sp
    )
)
