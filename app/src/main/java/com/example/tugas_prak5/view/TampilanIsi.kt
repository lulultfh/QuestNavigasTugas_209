@file:OptIn(ExperimentalMaterial3Api::class)
package com.example.tugas_prak5.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas_prak5.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilanInfo(
    onBerandaBtnClick: ()-> Unit,
    onFormBtnClick:() -> Unit,
){
    val items = listOf(
        Pair(first = stringResource(id = R.string.nama_lengkap), second = "Aprilia Kurnianti"),
        Pair(first = stringResource(id = R.string.jenis_kelamin), second = "Perempuan"),
        Pair(first = stringResource(id = R.string.statuskawin), second = "Lajang"),
        Pair(first = stringResource(id = R.string.alamat), second = "Sleman")
    )
    Scaffold(modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.listnyaKak), color = Color.White, fontSize = 30.sp) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = colorResource(id = R.color.purple_200))
            )
        }) { isiRuang->
        Column(modifier = Modifier
            .padding(paddingValues = isiRuang)
            .fillMaxSize()
            .background(color = colorResource(id = R.color.unguagakputih)),
            verticalArrangement = Arrangement.SpaceBetween) {
            Column(modifier = Modifier.padding(all = dimensionResource(id = R.dimen.padding_medium)),
                verticalArrangement = Arrangement.Top) {
                items.forEach { item ->
                    Card(elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
                        colors = CardDefaults.cardColors(containerColor = Color.White),
                        modifier = Modifier
                            .fillMaxWidth()) {
                        Column(modifier = Modifier
                            .padding(all=15.dp)) {
                            Text(text = item.first.uppercase(),
                                fontSize = 16.sp,
                                color = Color.Black)
                            Spacer(modifier = Modifier.height(5.dp))
                            Text(text = item.second,
                                fontWeight = FontWeight.Bold,
                                fontFamily = FontFamily.Cursive, fontSize = 22.sp,
                                color = Color.Black)
                        }
                    }
                    Spacer(modifier = Modifier.height(height = 10.dp))
                }
                Spacer(modifier = Modifier.height(height = 10.dp))
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = onBerandaBtnClick,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.ungutua)
                    )
                ) { Text(text = stringResource(id = R.string.beranda)) }
                Spacer(modifier = Modifier.height(height = 10.dp))
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick = onFormBtnClick,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.ungumuda)
                    )
                ) { Text(text = stringResource(id = R.string.form_daftar)) }
            }
        }
    }
}