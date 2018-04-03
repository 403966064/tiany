package com.trade.concurrent;

public class ReentrantLock {

    public String lock(){
        java.util.concurrent.locks.ReentrantLock lock = new java.util.concurrent.locks.ReentrantLock();
        lock.lock();
        if(!lock.tryLock()){
            return "没有获取到锁";
        }
        try {
            System.out.println("获取到锁并执行");
        }finally {
            lock.unlock();
        }
        return "";
    }
}
