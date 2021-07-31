package com.siyuan.factory.staticFactory;

import com.siyuan.entity.Cars;

import java.util.HashMap;
import java.util.Map;

public class instanceCarFactory {
    private Map<Integer, Cars> map;
    public instanceCarFactory(){
        map=new HashMap<>();
        map.put(1,new Cars(1,"audi"));
        map.put(2,new Cars(2,"benz"));
    }
    public  Cars getCar(int n){
        return map.get(n);
    }

    @Override
    public String toString() {
        return "instanceCarFactory{" +
                "map=" + map +
                '}';
    }
}
