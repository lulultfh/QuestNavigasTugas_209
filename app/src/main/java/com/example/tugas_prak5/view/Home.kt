@file:OptIn(ExperimentalMaterial3Api::class)
package com.example.tugas_prak5.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas_prak5.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(
    onSubmitBtnClick: () -> Unit
){
    Scaffold(modifier = Modifier) { iniRuangan->
        Column(modifier = Modifier.padding(paddingValues = iniRuangan).fillMaxSize()
            .background(color = colorResource(id = R.color.unguagakputih)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
                Text(text = stringResource(id = R.string.sapaan),
                    fontSize = 30.sp, fontFamily = FontFamily.Monospace,
                    color = colorResource(id = R.color.ungutua))
                Spacer(modifier = Modifier.height(height = 20.dp))
                Image(
                    painter = painterResource(id = R.drawable.hanni_njs),
                    contentDescription = null
                )
                Spacer(modifier = Modifier.height(height = 20.dp))
                Text(text = stringResource(id = R.string.namaaku),
                    fontSize = 20.sp, fontFamily = FontFamily.Monospace,
                    color = colorResource(id = R.color.ungutua))
                Spacer(modifier = Modifier.height(height = 10.dp))
                Text(text = stringResource(id = R.string.nimku),
                    fontSize = 20.sp, fontFamily = FontFamily.Monospace,
                    color = colorResource(id = R.color.ungutua))
                Spacer(modifier = Modifier.height(height = 20.dp))
                Button(
                    modifier = Modifier.fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp),
                    onClick =onSubmitBtnClick,
                    colors = ButtonDefaults.buttonColors(colorResource(id = R.color.ungutua))
                ) { Text(text = stringResource(id = R.string.submit),
                    color = Color.White) }
            }
    }
}