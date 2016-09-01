package com.zzz.app.result;

import java.util.List;

/**
 * Created by dell_2 on 2016/9/1.
 */
public class ListResult<T> extends BaseResult<T> {

    private List<T> objects;

    public List<T> getList(){
        return objects;
    }

    public void setObject(List<T> obj){
        objects = obj;
    }
}
