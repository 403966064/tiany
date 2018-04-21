package com.trade.concurrent.join;

public class JoinTest implements Runnable{


    @Override
    public void run() {
        System.out.println("线程"+Thread.currentThread().getName()+"开始运行");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程"+Thread.currentThread().getName()+"结束运行");
    }
}
