package com.v2.chat.ui.conversations.listeners;


import com.v2.chat.core.conversations.models.Conversation;

/**
 * Created by stefanodp91 on 07/12/17.
 */

public interface OnConversationClickListener {
    void onConversationClicked(Conversation conversation, int position);
}
