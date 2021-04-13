package com.v2.chat.ui.messages.listeners;


import com.v2.chat.core.users.models.IChatUser;

import java.io.Serializable;

/**
 * Created by stefanodp91 on 29/03/17.
 */
public interface OnAttachDocumentsClickListener<T> extends Serializable {
    void onAttachDocumentsClicked(IChatUser recipient, String channelType, T data);
}
