package com.blez.bleachfandom.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.blez.bleachfandom.presentation.screens.splash.SplashScreen
import com.blez.bleachfandom.presentation.screens.welcome.WelcomeScreen
import com.blez.bleachfandom.util.Constants.DETAILS_ARGUMENT_KEY

@Composable
fun SetupNavGraph(navController: NavHostController)
{
    NavHost(navController = navController, startDestination = Screen.Splash.route)
    {
        composable(route = Screen.Splash.route)
        {
            WelcomeScreen(navController)
           /* SplashScreen(navHostController = navController*)*/
        }
        composable(route = Screen.Welcome.route)
        {
            WelcomeScreen(navController)
        }
        composable(route = Screen.Home.route)
        {

        }
        composable(route = Screen.Details.route, arguments = listOf(navArgument(DETAILS_ARGUMENT_KEY){
            type = NavType.IntType
        }))
        {

        }
        composable(route = Screen.Search.route)
        {

        }

    }
}