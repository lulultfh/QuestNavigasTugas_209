package com.example.tugas_prak5

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

enum class Navigasi{
    LandingPage,
    Detail,
    Formulir
}

@Composable
fun AppUlsSederhana(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
){}