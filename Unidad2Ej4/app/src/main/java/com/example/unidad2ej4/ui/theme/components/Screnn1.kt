package com.example.unidad2ej4.ui.theme.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.unidad2ej4.Animales
import com.example.unidad2ej4.R

@Composable
fun Screen1()
{
    val itemList = listOf(
        Animales("Pajaro", R.drawable.bird),
        Animales("Gato", R.drawable.cat),
        Animales("Cocodrilo", R.drawable.coco),
        Animales("Perro", R.drawable.dog),
        Animales("Pulpo", R.drawable.squid),
    )

    LazyColumn{
        items(itemList){ asign ->
            Column(Modifier.fillMaxWidth().fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally){
                Box (
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color(0xF6CDE7B0))
                        .width(200.dp)
                        .height(40.dp),
                    contentAlignment = Alignment.Center

                ){
                    Text(
                        text=asign.animal,
                        fontSize = 20.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center
                    )
                }
                Box(
                    Modifier
                        .width(300.dp)
                        .height(190.dp)
                        .clip(shape = RoundedCornerShape(40.dp))
                        .background(Color.White),
                    contentAlignment = Alignment.Center
                ){
                    Image(
                        painter = painterResource(asign.idImagen),
                        contentDescription = "ImagenesAnimales",
                        contentScale = ContentScale.Fit
                    )
                }
                Spacer(Modifier.height(10.dp))
            }
        }
    }
}