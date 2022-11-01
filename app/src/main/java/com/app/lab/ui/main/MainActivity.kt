package com.app.lab.ui.main

import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.app.lab.R
import com.app.lab.base.BaseActivity
import com.app.lab.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getViewBinding(): ActivityMainBinding =
        ActivityMainBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupNavigation()
    }

    private fun setupNavigation() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.view_container) as NavHostFragment

        navigator?.let { nav ->
            nav.setNavController(navHostFragment.navController)
            nav.navController?.let { binding.navigationBar.setupWithNavController(it) }
        }
    }

}