package com.v2.chat

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.v2.chat.ui.ChatUI
import com.v2.chat.ui.login.activities.ChatLoginActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startActivity(Intent(this, ChatLoginActivity::class.java))
    }
}