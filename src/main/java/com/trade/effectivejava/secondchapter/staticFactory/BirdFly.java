package com.trade.effectivejava.secondchapter.staticFactory;

public class BirdFly  implements Fly {
    public void fly() {
        System.out.println("bird fly");
    }

    public static class CreateClass {

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
}
