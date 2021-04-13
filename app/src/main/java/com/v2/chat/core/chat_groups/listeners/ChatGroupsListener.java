package com.v2.chat.core.chat_groups.listeners;


import com.v2.chat.core.chat_groups.models.ChatGroup;
import com.v2.chat.core.exception.ChatRuntimeException;

/**
 * Created by stefanodp91 on 24/01/18.
 */

public interface ChatGroupsListener {

    void onGroupAdded(ChatGroup chatGroup, ChatRuntimeException e);

    void onGroupChanged(ChatGroup chatGroup, ChatRuntimeException e);

    void onGroupRemoved(ChatRuntimeException e);
}
