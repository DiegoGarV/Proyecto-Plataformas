package com.example.proyectoplatz.ui.favorites.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.proyectoplatz.ui.home.viewmodel.Post

class FavVM: ViewModel() {

}

var favorites = mutableStateListOf<Post>()