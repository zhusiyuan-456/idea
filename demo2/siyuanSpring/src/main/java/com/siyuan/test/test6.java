package com.siyuan.test;
import com.siyuan.factory.staticFactory.instanceCarFactory;
import com.siyuan.entity.Cars;
import com.siyuan.factory.staticFactory.staticCarfactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test6 {
    public static void main(String[] args) {
//        Cars car= staticCarfactory.getCar(1);
//        System.out.println(car);
//        instanceCarFactory fc=new instanceCarFactory();
//        System.out.println(fc.getCar(1));
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring-factory.xml");
        Cars car=(Cars) applicationContext.getBean("car");
        System.out.println(car);
    }
}
