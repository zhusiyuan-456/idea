package com.siyuan.test;

import com.siyuan.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        //now use ioc
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Student student=(Student) applicationContext.getBean("B_student");
        System.out.println(student);
        String a="sdaasdasd";
        String b=a.intern();
        System.out.println(b.intern());
    }
}
