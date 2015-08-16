package com.syncgy.opensync;

/**
 * Created by ryan on 8/16/15.
 */
public class APIException extends Exception {
    int code = 0;
    String message = null;

    public APIException() {}

    public APIException(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}