package com.v2.chat.core.contacts.listeners;


import com.v2.chat.core.exception.ChatRuntimeException;
import com.v2.chat.core.users.models.IChatUser;

/**
 * Created by andrealeo on 06/12/17.
 */

public interface ContactListener {

        public void onContactReceived(IChatUser contact, ChatRuntimeException e);
        public void onContactChanged(IChatUser contact, ChatRuntimeException e);
        public void onContactRemoved(IChatUser contact, ChatRuntimeException e);

}

