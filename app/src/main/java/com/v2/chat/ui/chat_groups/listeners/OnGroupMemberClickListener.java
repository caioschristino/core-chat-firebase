package com.v2.chat.ui.chat_groups.listeners;


import com.v2.chat.core.users.models.IChatUser;

/**
 * Created by stefanodp91 on 07/12/17.
 */

public interface OnGroupMemberClickListener {
    void onGroupMemberClicked(IChatUser groupMember, int position);
}
