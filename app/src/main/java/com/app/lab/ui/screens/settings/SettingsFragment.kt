package com.app.lab.ui.screens.settings

import android.os.Bundle
import android.view.View
import com.app.lab.base.BaseFragment
import com.app.lab.databinding.FragmentSettingsBinding

class SettingsFragment : BaseFragment<FragmentSettingsBinding>() {

    override fun getViewBinding(): FragmentSettingsBinding =
        FragmentSettingsBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initListeners()
    }

    private fun initListeners() {
        binding.toolbar.setNavigationOnClickListener {
            navigator?.tryGoBack()
        }
    }

}