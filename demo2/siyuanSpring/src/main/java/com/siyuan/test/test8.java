package com.siyuan.test;

import com.siyuan.entity.repository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test8 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-annotation.xml");
        repository re=(repository)applicationContext.getBean("hello");
//        System.out.println(re);
//        String[] names=applicationContext.getBeanDefinitionNames();
//        for(String name:names){
//            System.out.println(name);
//        }
        re.getMyInterface1().run();
        re.getMyInterface2().run();
    }
}
