package com.example.Firebasestorage.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.Firebasestorage.ui.theme.screens.about.Aboutscreen
import com.example.Firebasestorage.ui.theme.screens.clothing.clothingscreen
import com.example.Firebasestorage.ui.theme.screens.dashbord.dashboardscreen
import com.example.Firebasestorage.ui.theme.screens.home.HomeScreen
import com.example.Firebasestorage.ui.theme.screens.login.LoginScreen
import com.example.Firebasestorage.ui.theme.screens.signup.SignupScreen
import com.example.Firebasestorage.ui.theme.screens.splash.splashscreen
import com.example.Firebasestorage.ui.theme.screens.upload.UploadScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController:NavHostController = rememberNavController(), startDestination:String = ROUT_SPLASH) {
    NavHost(navController = navController, modifier=modifier, startDestination = startDestination){
        composable(ROUT_HOME){
            HomeScreen(navController)
        }

        composable(ROUT_LOGIN){
            LoginScreen(navController)
        }

        composable(ROUT_SIGNUP){
            SignupScreen(navController)
        }

        composable(ROUT_UPLOAD){
            UploadScreen(navController)
        }


        composable(ROUT_DASHBOARD){
            dashboardscreen(navController)
        }


        composable(ROUT_SPLASH){
            splashscreen(navController)
        }



        composable(ROUT_ABOUT){
            Aboutscreen(navController)
        }

        composable(ROUT_UPLOAD){
            UploadScreen(navController)
        }

        composable(ROUT_CLOTHING){
            clothingscreen(navController)
        }

    }
}