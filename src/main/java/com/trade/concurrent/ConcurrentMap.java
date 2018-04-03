package com.trade.concurrent;

import org.springframework.util.StringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMap {

    public Map<String, Integer> map = new ConcurrentHashMap<>();

    public void add(String key){
        Integer value = map.get(key);
        if(StringUtils.isEmpty(value)){
            map.put(key, 1);
        }else{
            map.put(key, value+1);
        }
    }
}
