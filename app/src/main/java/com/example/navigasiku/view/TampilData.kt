package com.example.navigasiku.view

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
                title = {Text( = stringResource(id = R.string.home),
                    color = Color.White)},
                colors = TopAppBarDefaults.topAppBarColors
                    (containerColor = colorResource(id = R.color.teal_700))
            )
        }
    ){ isiRuang ->
        Column(modifier = Modifier.padding(paddingValues = isiRuang),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally

        ){
            OutlinedTextField (
                value = ""
                singleline = true,
                modifier = Modifier
                    .padding(top = 20.dp)
                    .width(width = 250.dp),
                label = { Text(text = "Nama Lengkap") },
                onValueChange = {}
            )
            HorizontalDivider(modifier = Modifier

            )
        }

    }
}