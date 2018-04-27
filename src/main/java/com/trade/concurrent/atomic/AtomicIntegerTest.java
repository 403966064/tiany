package com.trade.concurrent.atomic;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by tiany on 2018/4/16.
 */
public class AtomicIntegerTest {
    private static AtomicInteger atomicInteger = new AtomicInteger();

    public int get() {
        return atomicInteger.incrementAndGet();
    }


    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                AtomicIntegerTest test = new AtomicIntegerTest();
                System.out.println(test.get());
            }
            );
            thread.start();
        }
    }
}
