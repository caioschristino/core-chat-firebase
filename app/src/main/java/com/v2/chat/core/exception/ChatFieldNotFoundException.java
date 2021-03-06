package com.v2.chat.core.exception;

/**
 * Created by andrealeo on 22/12/17.
 */

public class ChatFieldNotFoundException extends Exception {

    public ChatFieldNotFoundException() {
        super();
    }

    public ChatFieldNotFoundException(String message) {
       super(message);
    }

    public ChatFieldNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ChatFieldNotFoundException(Throwable cause) {
        super(cause);
    }

}
