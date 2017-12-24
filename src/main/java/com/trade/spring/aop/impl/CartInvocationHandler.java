package com.trade.spring.aop.impl;

import org.aopalliance.intercept.Invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CartInvocationHandler implements InvocationHandler {
    private Object object;

    public CartInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().equalsIgnoreCase("addShopping")){
            System.out.println("添加购物车之前的逻辑");
            return method.invoke(object, args);
        }
        return null;
    }
}
