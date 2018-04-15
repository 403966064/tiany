package com.trade.task;

import java.math.BigInteger;
import java.util.List;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Main {

    public List<BigInteger> aSecondOfPrimes() throws InterruptedException{
        PrimeGenerator generator = new PrimeGenerator();
        new Thread(generator).start();
        try {
            SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            generator.cancel();
        }
        return generator.get();
    }

    public static void main(String[] args) {
        Main main = new Main();
        try {
            System.out.println(main.aSecondOfPrimes());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
