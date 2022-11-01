package com.app.lab.ui.screens.notifications

import android.os.Bundle
import android.util.Log
import android.view.View
import com.app.lab.base.BaseFragment
import com.app.lab.databinding.FragmentNotificationsBinding
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.messaging.FirebaseMessaging

class NotificationsFragment : BaseFragment<FragmentNotificationsBinding>() {

    override fun getViewBinding(): FragmentNotificationsBinding =
        FragmentNotificationsBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        getNotificationToken()
    }

    private fun getNotificationToken() {
        FirebaseMessaging.getInstance().token.addOnCompleteListener(OnCompleteListener { task ->
            if (!task.isSuccessful) {
                Log.w(TAG, "Fetching FCM registration token failed", task.exception)
                return@OnCompleteListener
            }

            val token = task.result
            Log.d(TAG, token)
        })
    }

    companion object {
        const val TAG = "NotificationsFragment"
    }

}