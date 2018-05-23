package com.trade.concurrent.volat;


import org.apache.commons.lang.StringUtils;

/**
 * volatile的写操作优先于读操作
 */
public class VolatileDemo {
    private volatile int race = 0;

    public int getRace() {
        return race;
    }

    public void setRace() {
        this.race++;
    }

    public void test1(){
        try {
            for (int i = 0; i < 100; i++) {
                /**如果是2的倍数，对volatile进行写操作*/
                if(i % 2 == 0){
                    new Thread(() -> setRace()).start();
                }else{
                    /**读操作*/
                    new Thread(() -> getRace()).start();
                }
            }
            System.out.println(getRace());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void test2(){
        getRace();
        for (int i = 0; i < 100; i++) {
            setRace();
        }
        System.out.println(getRace());
    }

    public static void main(String[] args) {
        /*VolatileDemo volatileDemo = new VolatileDemo();
        try {
            volatileDemo.test2();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        String str = "123 456";
        System.out.println(StringUtils.isBlank(str));
    }
}
