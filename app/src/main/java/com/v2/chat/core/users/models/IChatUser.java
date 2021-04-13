package com.v2.chat.core.users.models;

import java.io.Serializable;

/**
 * Created by frontiere21 on 27/09/16.
 */
public interface IChatUser extends Serializable {
    void setId(String id);

    String getId();

    void setFullName(String fullName);

    String getFullName();

    void setEmail(String email);

    String getEmail();

    String getProfilePictureUrl();

    void setProfilePictureUrl(String profilePictureUrl);

    @Override
    String toString();

    int compareTo(IChatUser another);
}
