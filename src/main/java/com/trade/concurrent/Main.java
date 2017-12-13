package com.trade.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by tiany on 2017/12/13.
 */
public class Main {
    private static ExecutorService executor = Executors.newFixedThreadPool(50);

    public static void main(String[] args) {
        for(int i = 0; i <10; i++) {
            executor.submit(new Runnable() {
                public void run() {
                    new Synchronized().doSomeThing();
                }
            });
        }
    }
}
