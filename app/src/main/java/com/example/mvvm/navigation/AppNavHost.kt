package com.example.mvvm.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvm.ui.theme.screens.home.Homescreen
import com.example.mvvm.ui.theme.screens.login.loginscreen
import com.example.mvvm.ui.theme.screens.register.registerscreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavHost(modifier: Modifier= Modifier, navController:NavHostController= rememberNavController(), startDestination:String= ROUT_LOGIN){
    NavHost(navController =navController,modifier=modifier, startDestination = startDestination ){
     composable(ROUT_HOME){
         Homescreen(navController)
     }
        composable(ROUT_LOGIN){
            loginscreen(navController)
        }
        composable(ROUT_REGISTRATION){
            registerscreen(navController)
        }
    }

}