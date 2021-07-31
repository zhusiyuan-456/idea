package com.siyuan.test;

import com.siyuan.entity.Classes;
import com.siyuan.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring_di.xml");
        Classes classes=(Classes) applicationContext.getBean("classes");
        Student student=(Student) applicationContext.getBean("student11");
        System.out.println(classes);
        System.out.println(student);
    }
}
