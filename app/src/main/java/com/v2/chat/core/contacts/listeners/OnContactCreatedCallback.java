package com.v2.chat.core.contacts.listeners;

import com.v2.chat.core.exception.ChatRuntimeException;

/**
 * Created by stefanodp91 on 28/02/18.
 */

public interface OnContactCreatedCallback {
    void onContactCreatedSuccess(ChatRuntimeException exception);
}
