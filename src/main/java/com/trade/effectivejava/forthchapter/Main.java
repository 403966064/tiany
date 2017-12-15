package com.trade.effectivejava.forthchapter;

import java.util.Arrays;

/**
 * Created by tiany on 2017/12/15.
 */
public class Main {
    public static void main(String[] args) {
        InstrumentedHashSet set = new InstrumentedHashSet();
        set.addAll(Arrays.asList(
                "tom", "jim", "lilei"
                ));
        System.out.println(set.getAddCount());
    }
}
