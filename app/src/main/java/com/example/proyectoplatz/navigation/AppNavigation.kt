package com.example.proyectoplatz.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyectoplatz.ui.editProfile.view.EditProfileScreen
import com.example.proyectoplatz.ui.favorites.view.FavScreen
import com.example.proyectoplatz.ui.home.view.HomeScreen
import com.example.proyectoplatz.ui.profile.view.ProfileScreen
import com.example.proyectoplatz.ui.upload.view.UploadScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppSreens.HomeScreen.route){
        composable(route = AppSreens.HomeScreen.route){
            HomeScreen(navController = navController)
        }
        composable(route = AppSreens.UploadScreen.route){
            UploadScreen(navController)
        }
        composable(route = AppSreens.ProfileScreen.route){
            ProfileScreen(navController)
        }
        composable(route = AppSreens.FavScreen.route){
            FavScreen(navController)
        }
        composable(route = AppSreens.EditProfileScreen.route){
            EditProfileScreen(navController)
        }
    }
}
