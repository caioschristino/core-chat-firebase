package com.v2.chat.core.chat_groups.listeners;


import com.v2.chat.core.chat_groups.models.ChatGroup;
import com.v2.chat.core.exception.ChatRuntimeException;

/**
 * Created by stefanodp91 on 29/01/18.
 */

public interface ChatGroupCreatedListener {
    void onChatGroupCreated(ChatGroup chatGroup, ChatRuntimeException chatException);
}
