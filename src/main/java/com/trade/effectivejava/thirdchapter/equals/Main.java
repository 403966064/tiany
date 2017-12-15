package com.trade.effectivejava.thirdchapter.equals;

/**
 * Created by tiany on 2017/12/14.
 */
public class Main {
    public static void main(String[] args) {
//        Person person = new Person(26, 10000);
//
//        Map<Person, String> map = new HashMap<>();
//        map.put(person, "tom");
//        System.out.println(map.get(new Person(26, 10000)));

      Person person = new Person(26, 10000);
      Person person1 = new Person(27, 9000);
      System.out.println(person.compareTo(person1));
    }
}
