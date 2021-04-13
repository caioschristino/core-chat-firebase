package com.v2.chat.core.messages.listeners;


import com.v2.chat.core.exception.ChatRuntimeException;
import com.v2.chat.core.messages.models.Message;

/**
 * Created by andrealeo on 24/11/17.
 */

public interface SendMessageListener {

    void onBeforeMessageSent(Message message, ChatRuntimeException chatException);

    void onMessageSentComplete(Message message, ChatRuntimeException chatException);
}