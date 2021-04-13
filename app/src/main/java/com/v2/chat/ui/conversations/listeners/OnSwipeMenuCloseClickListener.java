package com.v2.chat.ui.conversations.listeners;


import com.v2.chat.core.conversations.models.Conversation;

public interface OnSwipeMenuCloseClickListener {
    void onSwipeMenuClosed(Conversation conversation, int position);
}
