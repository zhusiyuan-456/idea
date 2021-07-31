package com.siyuan.spring.test;

import com.siyuan.spring.IOC.MyClassPassXmlApplicationContext;
import com.siyuan.spring.entity.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new MyClassPassXmlApplicationContext("spring-ioc.xml");
        People a=(People) applicationContext.getBean("people2");

    }
}
