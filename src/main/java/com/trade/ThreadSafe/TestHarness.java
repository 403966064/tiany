package com.trade.ThreadSafe;

import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;

import java.util.concurrent.CountDownLatch;

public class TestHarness {
    public long timeTasks(int nThreads, final Runnable task) throws InterruptedException{
        final CountDownLatch startGate = new CountDownLatch(1);
        final CountDownLatch endGate = new CountDownLatch(nThreads);

        for (int i = 0; i < nThreads; i++) {
            Thread t = new Thread(() -> {
                try {
                    startGate.await();
                    try {
                        task.run();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }finally {
                        endGate.countDown();
                        System.out.println(endGate.getCount());
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            t.start();
        }
        long start = System.nanoTime();
        startGate.countDown();
        long end = System.nanoTime();
        return end - start;
    }

    public void easyTask(int nThread){
        CountDownLatch countDownLatch = new CountDownLatch(nThread);

        for (int i = 0; i < nThread; i++) {
            new Thread(()->{
                System.out.println("等待");
                countDownLatch.countDown();
            }).start();
        }
    }



    public static void main(String[] args) {
        TestHarness testHarness = new TestHarness();
        testHarness.easyTask(5);
    }
}
