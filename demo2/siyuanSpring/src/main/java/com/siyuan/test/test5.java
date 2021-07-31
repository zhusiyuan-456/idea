package com.siyuan.test;

import com.siyuan.entity.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class test5 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-properties.xml");
        DataSource dataSource=(DataSource) applicationContext.getBean("datasource");
        System.out.println(dataSource);

    }
}
