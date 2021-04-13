package com.v2.chat.ui.chat_groups.listeners;

import com.v2.chat.core.chat_groups.models.ChatGroup;

/**
 * Created by stefanodp91 on 07/12/17.
 */

public interface OnGroupClickListener {
    void onGroupClicked(ChatGroup chatGroup, int position);
}
