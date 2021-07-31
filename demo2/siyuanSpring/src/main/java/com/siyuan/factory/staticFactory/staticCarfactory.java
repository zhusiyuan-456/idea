package com.siyuan.factory.staticFactory;

import com.siyuan.entity.Cars;

import java.util.HashMap;
import java.util.Map;

public class staticCarfactory {
    private  static Map<Integer, Cars> map;
    static {
        map=new HashMap<>();
        map.put(1,new Cars(1,"audi"));
        map.put(2,new Cars(2,"benz"));
    }
    public static Cars getCar(int n){
        return map.get(n);
    }
}
