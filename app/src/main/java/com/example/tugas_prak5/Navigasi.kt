package com.example.tugas_prak5

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
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
        NavHost (
            navController = navController,
            startDestination= Navigasi.LandingPage.name,
            modifier = Modifier.padding(paddingValues = iniRuangan)
        ){
            composable(route = Navigasi.LandingPage.name){
                Home(
                    onSubmitBtnClick = {
                        navController.navigate(route = Navigasi.Detail.name)
                    }
                )
            }
            composable(route = Navigasi.Detail.name){
                TampilanInfo(
                    onBerandaBtnClick = { cancelAndBackToFormulir(navController) },
                    onFormBtnClick = {
                        navController.navigate(route = Navigasi.Formulir.name)
                    }
                )
            }
            composable(route = Navigasi.Detail.name) {
                FormIsi(
                    onBackBtnClick = navController.navigate(route = Navigasi.Detail.name)
                )
            }
        }
    }
}
