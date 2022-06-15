package com.a00570682.thefoodcourt;

import android.content.Context
import android.widget.Button
import android.content.Intent
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.ViewModel
import java.util.*

class MainMenuViewModel: ViewModel() {

    private val _foodRestaurants = mutableListOf<RestaurantCardData>()
    val restaurantsList get() = _foodRestaurants
    val name = "Chilaquiles Tec"
    val description = "Bienvenido a los chilaquiles Tec"
    val image = "image1.png"
    val screen = "ChilaquilesTecScreen"

    //TODO: add restaurants to List from the database
    //Temporary solution:

    fun newRestaurant() {
        val newRest = RestaurantCardData(name, description, image, screen);
        _foodRestaurants.add(newRest)
    }

    fun changeScreen(button: Button, context: Context?, screen: String){
        button.setOnClickListener {
            val intent: Intent = Intent(context, screen::class.java)
            startActivity(context!!, intent, null)
        }
    }


}