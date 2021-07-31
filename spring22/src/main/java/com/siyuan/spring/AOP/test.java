package com.siyuan.spring.AOP;

import com.siyuan.spring.IOC.MyClassPassXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;

public class test {
    public static void main(String[] args) {
//        myCal cal=new myCal();
//        myInvocationHandler myInvocationHandler=new myInvocationHandler();
//        calculator proxy=(calculator) myInvocationHandler.bind(cal);
//        proxy.add(10,3);
//        proxy.div(9,3);
//        proxy.mul(2,5);
       ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-aop.xml");
       calculator cal=(calculator) applicationContext.getBean("peter");
        cal.add(1,3);
        cal.div(3,0);

    }
}
                