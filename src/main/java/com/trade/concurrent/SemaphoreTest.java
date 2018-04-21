package com.trade.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    private static ExecutorService executorService = Executors.newCachedThreadPool();

    public static void main(String[] args) {
        final Semaphore semaphore = new Semaphore(5);
        for (int i = 0; i < 20; i++) {
            Runnable runnable = () -> {
                try {
                    semaphore.acquire();
                    Thread.sleep((long) Math.random());
                    semaphore.release();
                    System.out.println("剩余许可："+semaphore.availablePermits());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            };
            executorService.submit(runnable);
        }
        executorService.shutdown();
    }
}
