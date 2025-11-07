@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.tugas_prak5.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas_prak5.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsi(
    jenisK: List<String> = listOf("Laki-laki", "Perempuan"),
    status: List<String> = listOf("Janda", "Lajang", "Duda"),
    onBackBtnClick : () -> Unit
){
    Scaffold(modifier = Modifier,
        topBar = {
            TopAppBar(
                title = {Text(text = stringResource(id = R.string.form_daftar),
                    color = Color.White,
                    fontSize = 30.sp)},
                colors = TopAppBarDefaults.
                topAppBarColors(
                    containerColor = colorResource(id = R.color.purple_200)
                )
            )
        }) { isiRuang->
        Column(modifier = Modifier.padding(paddingValues = isiRuang)
            .background(color = colorResource(id = R.color.unguagakputih)),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(all = 20.dp)
            ) {
                ElevatedCard(
                    elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(bottom = 40.dp)
//                    .height(100.dp)
//                    .width(400.dp)
                ) {
                    Text(text = stringResource(id = R.string.nama_lengkap),
                        fontSize = 20.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(top = 20.dp, start = 20.dp))
                    OutlinedTextField(
                        value = "",
                        singleLine = true,
//                    shape = MaterialTheme.shapes.large,
                        modifier = Modifier.padding(top = 10.dp, start = 20.dp, end = 20.dp).fillMaxWidth(),
                        label = { Text(text = "Isian nama lengkap", color = Color.Black) },
                        onValueChange = {}
                    )
                    Text(text = stringResource(id = R.string.jenis_kelamin),
                        fontSize = 20.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(top = 20.dp, start = 20.dp))
                    Column(modifier = Modifier.padding(top = 10.dp, start = 20.dp, end = 20.dp)) {
                        jenisK.forEach { item ->
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                RadioButton(
                                    selected = false,
                                    onClick = { item },
                                    colors = RadioButtonDefaults.colors(
                                        selectedColor = Color.Black,
                                        unselectedColor = Color.Black
                                    )
                                )
                                Text(text = item,
                                    color = Color.Black)
                            }
                        }
                    }
                    Text(text = stringResource(id = R.string.statuskawin),
                        fontSize = 20.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(top = 20.dp, start = 20.dp))
                    Column(modifier = Modifier.padding(top = 10.dp, start = 20.dp, end = 20.dp)) {
                        status.forEach { item ->
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                RadioButton(
                                    selected = false,
                                    onClick = {item},
                                    colors = RadioButtonDefaults.colors(
                                        selectedColor = Color.Black,
                                        unselectedColor = Color.Black
                                    )
                                )
                                Text(text = item,
                                    color = Color.Black)
                            }
                        }
                    }
                    Text(text = stringResource(id = R.string.alamat),
                        fontSize = 20.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(top = 20.dp, start = 20.dp))
                    OutlinedTextField(
                        value = "",
                        singleLine = true,
//                    shape = MaterialTheme.shapes.large,
                        modifier = Modifier.padding(top = 10.dp, start = 20.dp, end = 20.dp).fillMaxWidth(),
                        label = { Text(text = "Isian alamat lengkap", color = Color.Black) },
                        onValueChange = {}
                    )
                    Button(modifier = Modifier.fillMaxWidth(fraction = 1f).padding(all = 20.dp),
//                    enabled = textAlamat.isNotEmpty(),
                        onClick = {onBackBtnClick()},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = colorResource(id = R.color.ungutua))) {
                        Text(text = stringResource(id = R.string.submit),
                            color = Color.White)
                    }
                }
            }
        }
    }
}
