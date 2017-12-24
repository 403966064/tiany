package com.trade.spring.aop.impl;

import com.trade.spring.aop.ICartService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartServiceImpl implements ICartService{
    private static final List<String> itemStr = new ArrayList<>();
    @Override
    public void addShopping(String item) {
        itemStr.add(item);
        System.out.println("购物车"+itemStr.toString());
        System.out.println("添加购物车成功");
    }
}
