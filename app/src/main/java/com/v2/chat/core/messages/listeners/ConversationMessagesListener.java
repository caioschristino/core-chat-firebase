package com.v2.chat.core.messages.listeners;


import com.v2.chat.core.exception.ChatRuntimeException;
import com.v2.chat.core.messages.models.Message;

/**
 * Created by andrealeo on 06/12/17.
 */

public interface ConversationMessagesListener {

    public void onConversationMessageReceived(Message message, ChatRuntimeException e);

    public void onConversationMessageChanged(Message message, ChatRuntimeException e);

}

