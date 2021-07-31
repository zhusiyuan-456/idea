package com.siyuan.myinterface.myiml;

import com.siyuan.myinterface.myInterface;
import lombok.Data;
import org.springframework.stereotype.Component;
@Component
public class myImplement1 implements myInterface {
    public void run(){
        System.out.println("running impl1");
    }
}
