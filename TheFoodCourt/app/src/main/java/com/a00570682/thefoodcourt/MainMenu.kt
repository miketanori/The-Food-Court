package com.a00570682.thefoodcourt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.navigation.fragment.NavHostFragment
//import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.a00570682.thefoodcourt.databinding.MainScrollableBinding

class MainMenu : AppCompatActivity() {
    //private val viewModel : MainMenuViewModel by activityViewModels()

    private lateinit var binding: MainScrollableBinding
    private val _foodRestaurants = mutableListOf<RestaurantCardData>()
    val restaurantsList get() = _foodRestaurants
    val name = "Ch"
    val description = "osidfanfdosa"
    val image = "image1.png"
    val screen = "ChilaquilesTecScreen"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainScrollableBinding.inflate(layoutInflater)
        setContentView(R.layout.main_scrollable)

        newRestaurant()

        val adapter = Adapter(_foodRestaurants)
        binding.mainItemsRView.adapter = adapter
        //binding.mainItemsRView.layoutManager = LinearLayoutManager(activity)

    }

    fun newRestaurant() {
        val newRest = RestaurantCardData(name, description, image, screen);
        _foodRestaurants.add(newRest)
    }
}