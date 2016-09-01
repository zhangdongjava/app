package com.zzz.app.result;

/**
 * Created by dell_2 on 2016/9/1.
 */
public enum  ResultStatus {
    SUCCESS("success"),
    FAIL("fail")
    ;

    private String name;

    private ResultStatus(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
