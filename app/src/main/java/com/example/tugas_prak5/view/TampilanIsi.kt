@file:OptIn(ExperimentalMaterial3Api::class)
package com.example.tugas_prak5.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
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
                title = { Text(text = stringResource(id = R.string.listnyaKak), color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = colorResource(id = R.color.purple_200))
            )
        }) { isiRuang->
        Column(modifier = Modifier.padding(paddingValues = isiRuang),
            verticalArrangement = Arrangement.SpaceBetween) {
            Column(modifier = Modifier.padding(all = dimensionResource(id = R.dimen.padding_medium)),
                verticalArrangement = Arrangement.spacedBy(space = dimensionResource(id = R.dimen.padding_small))) {
                items.forEach { item ->
                    Column {
                        Card(colors = CardDefaults.cardColors(containerColor = Color.White),
                            modifier = Modifier
                                .fillMaxSize()) {
                            Text(text = item.first.uppercase(),
                                fontSize = 16.sp)
                            Text(text = item.second,
                                fontWeight = FontWeight.Bold,
                                fontFamily = FontFamily.Cursive, fontSize = 22.sp)
                        }
                    }
                    Spacer(modifier = Modifier.height(height = 10.dp))
                    Button(
                        modifier = Modifier.fillMaxWidth(),
                        onClick = onBerandaBtnClick
                    ) { Text(text = stringResource(id = R.string.beranda)) }
                    Spacer(modifier = Modifier.height(height = 10.dp))
                    Button(
                        modifier = Modifier.fillMaxWidth(),
                        onClick = onFormBtnClick
                    ) { Text(text = stringResource(id = R.string.form_daftar)) }
                }
            }
        }
    }
}