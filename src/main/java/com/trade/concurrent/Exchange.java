package com.trade.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class Exchange extends Thread{

    public static void main(String[] args) {
        final Exchanger<List<Integer>> exchanger = new Exchanger<List<Integer>>();

        new Thread(){
            @Override
            public void run(){

                List<Integer> l = new ArrayList<>();
                l.add(1);
                l.add(2);
                try {
                    l = exchanger.exchange(l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1 ："+l);
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
                List<Integer> l = new ArrayList<>();
                l.add(3);
                l.add(4);
                try {
                    l = exchanger.exchange(l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2 ："+l);
            }
        }.start();
    }
}
