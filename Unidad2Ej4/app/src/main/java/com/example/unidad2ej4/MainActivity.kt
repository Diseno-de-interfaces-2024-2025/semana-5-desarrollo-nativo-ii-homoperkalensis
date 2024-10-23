package com.example.unidad2ej4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.unidad2ej4.ui.theme.Screen2
import com.example.unidad2ej4.ui.theme.Screen3
import com.example.unidad2ej4.ui.theme.Unidad2Ej4Theme
import com.example.unidad2ej4.ui.theme.components.Screen1

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Unidad2Ej4Theme {
                val navController = rememberNavController()
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        CenterAlignedTopAppBar(
                            colors = TopAppBarDefaults.topAppBarColors(
                                containerColor = Color(0x76CDE7B0)
                            ),
                            title = { Text(text = "Animales", fontSize = 25.sp) },
                            navigationIcon = {
                                Icon(
                                    contentDescription = "GoBack",
                                    imageVector = Icons.Filled.ArrowBack
                                )
                            },
                            actions = {
                                Icon(
                                    contentDescription = "ProfilePhoto",
                                    imageVector = Icons.Filled.AccountCircle
                                )
                            }
                        )
                    },
                    bottomBar = {
                        BottomAppBar(containerColor = Color(0x76CDE7B0))
                        {
                            Row(
                                Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceEvenly
                            ) {
                                Box(Modifier
                                    .clip(shape = CircleShape)
                                    .size(50.dp)
                                    .background(Color(0x36CDE7B0))
                                    .clickable {
                                        navController.navigate("screen1")
                                    },
                                    contentAlignment = Alignment.Center
                                ){
                                    Icon(
                                        contentDescription = "Home",
                                        imageVector = Icons.Filled.Home
                                    )
                                }
                                Box(Modifier
                                    .clip(shape = CircleShape)
                                    .size(50.dp)
                                    .background(Color(0x36CDE7B0))
                                    .clickable {
                                        navController.navigate("screen2")
                                    },
                                    contentAlignment = Alignment.Center
                                ){
                                    Icon(
                                        contentDescription = "Create",
                                        imageVector = Icons.Filled.Create
                                    )
                                }
                                Box(Modifier
                                    .clip(shape = CircleShape)
                                    .size(50.dp)
                                    .background(Color(0x36CDE7B0))
                                    .clickable {
                                        navController.navigate("screen3")
                                    },
                                    contentAlignment = Alignment.Center
                                ){
                                    Icon(
                                        contentDescription = "Favourite",
                                        imageVector = Icons.Filled.Favorite
                                    )
                                }
                            }
                        }
                    }

                ) {
                    innerPadding -> Box(modifier = Modifier.padding(innerPadding).background(color = Color(0xD6A6E7B0))){
                    MyNavControllerCustom(
                        navController)
                    }
                }
            }
        }
    }
}

data class Animales(val animal : String, val idImagen : Int)

@Composable
fun MyNavControllerCustom(navController: NavHostController){

    NavHost(
            navController = navController, startDestination = "screen1"
        ){
        composable("screen1"){ Screen1() }
        composable("screen2"){ Screen2() }
        composable("screen3"){ Screen3() }
    }
}

