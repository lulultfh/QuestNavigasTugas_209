package com.example.tugas_prak5

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHost
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
){
    Scaffold { iniRuangan->
        NavHost(
            navController = navController,
            startDestination= Navigasi.LandingPage.name,
            modifier = Modifier.padding(paddingValues = iniRuangan)
        )
    }
}