package com.trade.ThreadSafe;

public class Widget {

    public synchronized void doSomething(){
        System.out.println("执行父类的dosomething方法");
    }
}
