package com.example.navigasiku.view

import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource

@Composable
fun FormIsian(
    jenisK:List<String> = listOf("Laki-Laki", "Perempuan"),
    OnSubmitBtnClick : () -> Unit
){
    Scaffold (modifier = Modifier,
        topBar = {
            TopAppBar(
                title = {Text(text = stringResource(id = R.string.home),
                    color = Color.White)},
                colors = TopAppBarDefaults.topAppBarColors
                    (containerColor = colorResource(id = R.color.teal_700))
            )
        }
    )
}