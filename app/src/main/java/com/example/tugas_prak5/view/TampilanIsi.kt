@file:OptIn(ExperimentalMaterial3Api::class)
package com.example.tugas_prak5.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.tugas_prak5.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampianInfo(
    onBerandaBtnClick: ()-> Unit,
    onFormBtnCLick:() -> Unit
){
    val items = listOf(
        Pair(first = stringResource(id = R.string.nama_lengkap), second = "Aprilia Kurnianti"),
        Pair(first = stringResource(id = R.string.jenis_kelamin), second = "Perempuan"),
        Pair(first = stringResource(id = R.string.statuskawin), second = "Lajang"),
        Pair(first = stringResource(id = R.string.alamat), second = "Sleman")
    )
}