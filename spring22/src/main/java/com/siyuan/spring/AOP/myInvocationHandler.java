package com.siyuan.spring.AOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class myInvocationHandler implements InvocationHandler {
    //委托对象
    private Object object=null;
    //对对象进行代理
    public Object bind(Object object){
        this.object=object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //实现解耦合--业务代码+非业务代码
        System.out.println(method.getName()+"方法参数是"+ Arrays.toString(args));
        Object result= method.invoke(this.object,args);
        System.out.println(method.getName()+"结果是"+result);
     return result;
    }
}
