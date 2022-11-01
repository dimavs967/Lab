package com.app.lab.services

import android.content.Intent
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService

class NotificationsService : FirebaseMessagingService() {

    override fun handleIntent(intent: Intent?) {
        super.handleIntent(intent)

    }

    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.d(this.javaClass.simpleName, token)
    }

}