package com.v2.chat.utils.http_manager;

/**
 * Created by stefanodp91 on 09/05/17.
 */
public interface OnResponseRetrievedCallback<T> {
    void onSuccess(T response);

    void onError(Exception e);
}
