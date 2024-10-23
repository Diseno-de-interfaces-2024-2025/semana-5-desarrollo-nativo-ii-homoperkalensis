package com.example.unidad2ej4.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import com.example.unidad2ej4.R

@Composable
fun Screen3(){
    Column() {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.weight(1f).fillMaxSize().background(Color(0xF6CDE7B0))
        ){
            Text(
                text = "La tortuga",
                fontSize = 30.sp,
                color = Color.Black
            )
        }
        Image(
            painter = painterResource(R.drawable.tortuga),
            contentDescription = "Tortuga",
            contentScale = ContentScale.Fit,
            modifier = Modifier.weight(4f)
        )
    }
}