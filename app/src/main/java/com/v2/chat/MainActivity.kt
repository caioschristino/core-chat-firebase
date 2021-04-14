package com.v2.chat

import com.v2.chat.ui.conversations.activities.ConversationListActivity
import com.v2.chat.ui.login.activities.ChatSplashActivity
import com.v2.chat.ui.pin.activites.MapsActivity

class MainActivity : ChatSplashActivity() {
    override fun getTargetClass(): Class<*> = MapsActivity::class.java
}