@file:OptIn(ExperimentalMaterial3Api::class)
package com.example.tugas_prak5.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas_prak5.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(
    onSubmitBtnClick: () -> Unit
){
    Scaffold(modifier = Modifier) { iniRuangan->
        Column(modifier = Modifier.padding(paddingValues = iniRuangan),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Column {
                Text(text = stringResource(id = R.string.sapaan),
                    fontSize = 30.sp)
                Spacer(modifier = Modifier.height(height = 20.dp))
                Image(
                    painter = painterResource(id = R.drawable.hanni_njs),
                    contentDescription = null
                )
                Spacer(modifier = Modifier.height(height = 20.dp))
                Text(text = stringResource(id = R.string.namaaku),
                    fontSize = 15.sp)
                Spacer(modifier = Modifier.height(height = 10.dp))
                Text(text = stringResource(id = R.string.nimku),
                    fontSize = 15.sp)
                Spacer(modifier = Modifier.height(height = 20.dp))
                Button(
                    modifier = Modifier.fillMaxWidth(),
                    onClick =onSubmitBtnClick
                ) { Text(text = stringResource(id = R.string.submit)) }
            }
        }
    }
}