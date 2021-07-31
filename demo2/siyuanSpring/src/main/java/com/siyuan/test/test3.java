package com.siyuan.test;

import com.siyuan.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test3 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-scope.xml");
        User user1=(User) applicationContext.getBean("user1");
        User user2=(User) applicationContext.getBean("user2");
        System.out.println(user1);
        System.out.println(user2);
    }
}
