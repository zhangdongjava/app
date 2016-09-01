package com.zzz.app.result;

/**
 * Created by dell_2 on 2016/9/1.
 */
public interface Result<T> {

    ResultStatus getStauts();

    void setStauts(ResultStatus resultStatus);

    String getMessage();
    void setMessage(String message);
    public T getObject();

    public void setObject(T obj);
}
