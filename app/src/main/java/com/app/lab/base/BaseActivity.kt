package com.app.lab.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.app.lab.utils.navigation.Navigator

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    var navigator: Navigator? = null

    private var _binding: VB? = null
    val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = getViewBinding()
        navigator = Navigator()

        setContentView(binding.root)
    }

    abstract fun getViewBinding() : VB

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}