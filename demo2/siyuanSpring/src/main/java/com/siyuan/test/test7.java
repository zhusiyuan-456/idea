package com.siyuan.test;

import com.siyuan.entity.Cars;
import com.siyuan.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test7 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-autowire.xml");
        Student student=(Student) applicationContext.getBean("student");
        System.out.println(student);
    }
}
