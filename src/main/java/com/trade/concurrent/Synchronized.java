package com.trade.concurrent;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tiany on 2017/12/13.
 */
public class Synchronized {
    static int count = 0;
    /**
     * 普通同步方法
     * 锁是当前的实例对象
     */
    public static synchronized void doSomeThing(){
        count++;
        System.out.println("count ->" + count);
    }


    public Map<String, Integer> map = new HashMap<>();

    public synchronized void add(String key){
        Integer value = map.get(key);
        if(StringUtils.isEmpty(value)){
            map.put(key, 1);
        }else{
            map.put(key, value+1);
        }
    }
}
