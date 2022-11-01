package com.app.lab.utils.navigation

import androidx.navigation.NavController
import androidx.navigation.NavDirections
import java.lang.Exception

class Navigator {

    private var _navController: NavController? = null
    val navController get() = _navController

    fun setNavController(controller: NavController) {
        _navController = controller
    }

    fun tryGoBack() {
        navController?.popBackStack()
    }

    fun open(direction: NavDirections) {
        try {
            navController?.navigate(direction)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

}