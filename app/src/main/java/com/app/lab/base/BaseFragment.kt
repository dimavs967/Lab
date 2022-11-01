package com.app.lab.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.app.lab.utils.navigation.Navigator

abstract class BaseFragment<VB : ViewBinding> : Fragment() {

    var navigator: Navigator? = null

    private var _binding: VB? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = getViewBinding()
        navigator = Navigator()
        navigator?.setNavController(this.findNavController())
        return binding.root
    }

    abstract fun getViewBinding(): VB

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        navigator = null
    }

}