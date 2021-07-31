package com.siyuan.spring.AOP;

import org.springframework.stereotype.Component;

@Component("peter")
public class myCal implements calculator {
    @Override
    public int add(int num1, int num2) {

        return num1 + num2;
    }

    @Override
    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int mul(int num1, int num2) {

        return num1 * num2;
    }

    @Override
    public int div(int num1, int num2) {
        return num1 / num2;
    }
}
