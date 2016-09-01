package com.zzz.app.result;

import java.io.Serializable;

/**
 * Created by dell_2 on 2016/9/1.
 */
public class BaseResult<T> implements Result<T>,Serializable {


    private T object;

    private ResultStatus resultStatus;

    private String message;

    public ResultStatus getStauts() {
        return null;
    }

    public void setStauts(ResultStatus resultStatus) {

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getObject() {
        return null;
    }

    public void setObject(T obj) {

    }
}
