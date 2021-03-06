package com.v2.chat.core.authentication.task;

/**
 * Created by stefanodp91 on 29/05/17.
 */

public interface OnCustomAuthTokenRefreshCallback<T> {
    void onRefreshSuccess(T data);

    void onRefreshError(Exception e);
}
