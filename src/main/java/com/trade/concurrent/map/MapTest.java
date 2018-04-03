package com.trade.concurrent.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tiany on 2018/3/30.
 */
public class MapTest {

    private void test(){
        Map<String, Object> map = new HashMap<>();
        map.put("1", "张三'");
        System.out.println(map.getOrDefault("1", "ceshi "));
    }

    public static void main(String[] args) {
        MapTest map = new MapTest();
        map.test();
    }

}
