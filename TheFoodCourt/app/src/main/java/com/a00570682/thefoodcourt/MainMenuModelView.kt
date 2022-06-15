package com.a00570682.thefoodcourt;

import androidx.lifecycle.ViewModel
import java.util.*

class MainMenuViewModel: ViewModel() {

    private val _foodRestaurants = mutableListOf<RestaurantCardData>()
    val restaurantsList get() = _foodRestaurants
    val name = "Ch"
    val description = "osidfanfdosa"
    val image = "image1.png"
    val screen = "ChilaquilesTecScreen"

    //TODO: add restaurants to List from the database
    //Temporary solution:

    fun newRestaurant() {
        val newRest = RestaurantCardData(name, description, image, screen);
        _foodRestaurants.add(newRest)
    }


}