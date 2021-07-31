package com.siyuan.test;

import com.siyuan.controller.myController;
import com.siyuan.service.myService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test10 {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("spring-annotation.xml");
       //simulate the client request;

        myController mc=app.getBean(myController.class);

        System.out.println(mc.service(99.0));

    }
}
