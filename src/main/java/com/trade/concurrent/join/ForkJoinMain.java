package com.trade.concurrent.join;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class ForkJoinMain {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.submit(new ForkJoinTest(0, 1000));
        forkJoinPool.awaitQuiescence(2, TimeUnit.SECONDS);
        forkJoinPool.shutdown();
    }
}
