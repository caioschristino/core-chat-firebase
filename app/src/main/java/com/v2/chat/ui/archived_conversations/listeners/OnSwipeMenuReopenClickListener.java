package com.v2.chat.ui.archived_conversations.listeners;


import com.v2.chat.core.conversations.models.Conversation;

public interface OnSwipeMenuReopenClickListener {
    void onSwipeMenuReopened(Conversation conversation, int position);
}
