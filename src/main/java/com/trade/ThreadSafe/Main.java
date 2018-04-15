package com.trade.ThreadSafe;

import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static ExecutorService executor = Executors.newFixedThreadPool(50);

    /*public void pojoTest(){
        Pojo pojo = new Pojo();
        pojo.setId(1);
        pojo.setAge(18);
        pojo.setName("lilei");
        Pojo.STUDENT = "学生";
        for (int i = 0; i < 1000; i++) {
            executor.submit(new Runnable() {
                public void run() {
                    pojo.setId(2);
                    System.out.println(pojo.getId());
                }
            });
        }
    }*/


    public void countTest(){
        UnsageSequence pojo = new UnsageSequence();
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> System.out.println(pojo.getNext())).start();
        }
    }

    private void lazyInitRaceTest(){
        LazyInitRace initRace = new LazyInitRace();
        for (int i = 0; i < 10; i++) {
            new Thread(()-> initRace.getInstance()).start();
        }
    }

    public void countFactorizerTest(){
        CountingFactorizer countingFactorizer = new CountingFactorizer();
        for (int i = 0; i < 10; i++) {
            new Thread(()-> countingFactorizer.setCount()).start();
        }
    }

    public void widgetTest(){
        Widget widget = new Widget();
        LoggingWidget loggingWidget = new LoggingWidget();
        new Thread(() -> loggingWidget.doSomething()).start();
        new Thread(() -> widget.doSomething()).start();

    }

    public void unsafeTest(){
        UnsageSequence unsageSequence = new UnsageSequence();
        Pojo pojo = new Pojo(unsageSequence);

        for (int i = 0; i < 200; i++) {
            new Thread(()-> System.out.println(pojo.unsafeMethods())).start();
        }
    }

    public void vectorTest(){
        Vector<Integer> vector = new Vector<>();


    }


    public static void main(String[] args) {
        Main main = new Main();
        main.countTest();
        System.exit(0);
    }
}
