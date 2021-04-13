package com.v2.chat.core.conversations.listeners;

import com.v2.chat.core.conversations.models.Conversation;

/**
 * Created by stefanodp91 on 19/10/17.
 */

public interface OnConversationRetrievedCallback {

    void onConversationRetrievedSuccess(Conversation conversation);

    void onNewConversationCreated(String conversationId);

    void onConversationRetrievedError(Exception e);
}
