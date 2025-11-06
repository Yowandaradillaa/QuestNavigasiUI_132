package com.example.navigasiku

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.navigasiku.ui.theme.NavigasiKuTheme

@Composable
fun DataApp(
    navController : NavHostController = rememberNavController(),
    modifier: Modifier
){
    Scaffold { isiRuang ->
        val navHost = NavHost(
            navController = navController,
            startDestination = Navigasi.Formulirku.name,

            modifier = Modifier.padding(paddingValues = isiRuang) {
                composable(route = Navigasi.Formulirku.name){

                }
            }
        )

    }
}