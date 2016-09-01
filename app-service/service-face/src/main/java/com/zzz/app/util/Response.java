package com.zzz.app.util;

/**
 * Created by dell_2 on 2016/9/1.
 */
public class Response {

    private String message;

    private boolean  success;

    private Object context;

    public Response(String message, boolean success) {
        this.message = message;
        this.success = success;
    }

    public Response( boolean success) {
        this.success = success;
    }

    public Response(boolean success, Object context) {
        this.success = success;
        this.context = context;
    }

    public Response(Object context, boolean success, String message) {
        this.context = context;
        this.success = success;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getContext() {
        return context;
    }

    public void setContext(Object context) {
        this.context = context;
    }
}
