package com.v2.chat.core.conversations.listeners;


import com.v2.chat.core.exception.ChatRuntimeException;

/**
 * Created by andrealeo on 06/12/17.
 */

public interface UnreadConversationsListener {

    void onUnreadConversationCounted(int count, ChatRuntimeException e);

}

