package com.trade.effectivejava.secondchapter.Singleton;

/**
 * 创建singleton的几种方式
 */
public class Singleton {
    /**
     * 1
     */
    private static Singleton singleton = new Singleton();
    //private Singleton(){}

    public static Singleton getSingleton() {
        return singleton;
    }
    /**
     *2
     */
    public static Singleton singleton2 = new Singleton();
    private Singleton(){}

    public enum Instance{
        INSTANCE
    }


}
