package com.trade.concurrent;

/**
 * Created by tiany on 2017/12/13.
 */
public class Synchronized {
    static int count = 0;
    /**
     * 普通同步方法
     * 锁是当前的实例对象
     */
    public static synchronized void doSomeThing(){
        count++;
        System.out.println("count ->" + count);
    }
}
