package com.app.lab.ui.screens.profile

import android.os.Bundle
import android.view.View
import com.app.lab.base.BaseFragment
import com.app.lab.databinding.FragmentProfileBinding

class ProfileFragment : BaseFragment<FragmentProfileBinding>() {

    override fun getViewBinding(): FragmentProfileBinding =
        FragmentProfileBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initListeners()
    }

    private fun initListeners() {
        binding.icSettings.setOnClickListener {
            navigator?.open(ProfileFragmentDirections.actionProfileFragmentToSettingsFragment())
        }
    }

}