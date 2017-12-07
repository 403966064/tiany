package com.trade.effectivejava.secondchapter;

public class CreateClass {

    /*构造器的方式*/
    public CreateClass(){

    }

    public static CreateClass getInstance(){
        return new CreateClass();
    }


    public static Fly getFlyInstance(){
        return new BirdFly();
    }

}
