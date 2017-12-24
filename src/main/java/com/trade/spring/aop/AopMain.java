package com.trade.spring.aop;

import com.trade.spring.aop.impl.CartInvocationHandler;
import com.trade.spring.aop.impl.CartServiceImpl;

import java.lang.reflect.Proxy;

public class AopMain {

    public static void main(String[] args) {
       // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       // ICartService cartService = (ICartService) context.getBean("cartPoxyServiceImpl");
       // cartService.addShopping("1234");
//            ICartService cartService = Proxy.newProxyInstance(
//                    .class.getClassLoader(),
//                    new Class[]{ICartService.class},
//                    new CartInvocationHandler(new CartServiceImpl())

//            );
//            cartService.addShopping("1234");
    }
}
