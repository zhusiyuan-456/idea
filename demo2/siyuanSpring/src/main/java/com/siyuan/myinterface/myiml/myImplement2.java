package com.siyuan.myinterface.myiml;

import com.siyuan.myinterface.myInterface;
import org.springframework.stereotype.Component;

@Component
public class myImplement2 implements myInterface {
    public void run(){
        System.out.println("running impl2");
    }
}
