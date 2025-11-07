@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.tugas_prak5.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsi(
    jenisK: List<String> = listOf("Laki-laki", "Perempuan"),
    onBackBtnClick : () -> Unit
){}
