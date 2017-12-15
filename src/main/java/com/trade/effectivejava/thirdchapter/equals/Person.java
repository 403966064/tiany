package com.trade.effectivejava.thirdchapter.equals;

/**
 * Created by tiany on 2017/12/14.
 */
public class Person implements Comparable<Person>{
    private static final int result = 17;
    private int age;
    private int money;

    public Person(int age, int money) {
        this.age = age;
        this.money = money;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }
        if(!(obj instanceof Person)){
            return false;
        }
        Person person = (Person)obj;
        return person.age == age && person.money == money;
    }

    @Override
    public int hashCode() {
        return result * 37 + (int)age + (int)money;
    }


//    public int compareTo(Object o) {
//        if(o == null){
//            return 1;
//        }
//        if(!(o instanceof Person)){
//            return -1;
//        }
//        Person person = (Person) o;
//        if(person.age > age && person.money > money){
//            return -1;
//        }else if(person.age == age && person.money == money){
//            return 0;
//        }else{
//            return 1;
//        }
//    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }
}
