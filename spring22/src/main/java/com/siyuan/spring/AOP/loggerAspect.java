package com.siyuan.spring.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class loggerAspect {
    @Before("execution(public int com.siyuan.spring.AOP.myCal.add(..))")
    public void before(JoinPoint joinPoint){
        String name=joinPoint.getSignature().getName();
        String arg= Arrays.toString(joinPoint.getArgs());
        System.out.println(name+"method args are"+arg);
    }
    @After("execution(public int com.siyuan.spring.AOP.myCal.add(..))")
    public void after(JoinPoint joinPoint){
        String name=joinPoint.getSignature().getName();
        System.out.println(name+"method complete");
    }
    @AfterReturning(value="execution(public int com.siyuan.spring.AOP.myCal.add(..))",returning = "result")
    public void afterReturn(JoinPoint joinPoint,Object result){
        String name=joinPoint.getSignature().getName();
        System.out.println("the result is "+result);
    }

    @AfterThrowing(value="execution(public int com.siyuan.spring.AOP.myCal.add(..))",throwing = "exception")
    public void afterThrowing(JoinPoint joinPoint, Exception exception){
        String name=joinPoint.getSignature().getName();
        System.out.println(name+"throwing exception"+exception)  ;
    }

}
