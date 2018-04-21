package com.trade.concurrent.join;

import java.util.concurrent.RecursiveAction;

public class ForkJoinTest extends RecursiveAction {
    private static final int MAX = 20;
    private int start;
    private int end;

    public ForkJoinTest(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if (end - start < MAX) {
            for (int i = start; i < end; i++) {
                System.out.println(Thread.currentThread().getName() +"i 值"+i);
            }
        }else{
            int middle = (start + end) / 2;
            ForkJoinTest left = new ForkJoinTest(start, middle);
            ForkJoinTest right = new ForkJoinTest(middle, end);
            left.fork();
            right.fork();
        }
    }
}
