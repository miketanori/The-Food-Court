package com.a00570682.thefoodcourt

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.a00570682.thefoodcourt.databinding.FragmentListaBinding
//import androidx.navigation.fragment.NavHostFragment
//import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.a00570682.thefoodcourt.databinding.MainContainerBinding

class MainMenu : AppCompatActivity() {
    //private val viewModel : MainMenuViewModel by activityViewModels()

    private lateinit var binding: MainContainerBinding
    private val _foodRestaurants = mutableListOf<RestaurantCardData>()
    val restaurantsList get() = _foodRestaurants
    val name = "Ch"
    val description = "osidfanfdosa"
    val image = "image1.png"
    val screen = "ChilaquilesTecScreen"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainContainerBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        newRestaurant()
//
//        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
//        var navController = navHostFragment.navController
//        setupWithNavController(binding.bottomNav,navController)

    }

//    fun newRestaurant() {
//        val newRest = RestaurantCardData(name, description, image, screen);
//        _foodRestaurants.add(newRest)
//    }
}