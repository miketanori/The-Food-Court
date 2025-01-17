package com.a00570682.thefoodcourt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import androidx.navigation.fragment.NavHostFragment
//import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.a00570682.thefoodcourt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val intent: Intent = Intent(this, MainMenu::class.java)
            startActivity(intent)
        }
    }
}