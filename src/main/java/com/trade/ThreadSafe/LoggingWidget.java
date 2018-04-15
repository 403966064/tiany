package com.trade.ThreadSafe;

public class LoggingWidget extends Widget {

    @Override
    public synchronized void doSomething() {
        System.out.println("执行子类的dosomething方法");
        super.doSomething();
        try {
            System.out.println("获取到子类的锁");
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
