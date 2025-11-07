package com.example.tugas_prak5

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tugas_prak5.view.FormIsi
import com.example.tugas_prak5.view.Home
import com.example.tugas_prak5.view.TampilanInfo

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
                    onBerandaBtnClick = { cancelAndBackToHome(navController) },
                    onFormBtnClick = {
                        navController.navigate(route = Navigasi.Formulir.name)
                    }
                )
            }
            composable(route = Navigasi.Formulir.name) {
                FormIsi(
                    onBackBtnClick = {navController.navigate(route = Navigasi.Detail.name)}
                )
            }
        }
    }
}
private fun cancelAndBackToHome(
    navController: NavHostController
){
    navController.popBackStack(route = com.example.tugas_prak5.Navigasi.LandingPage.name, inclusive = false)
}