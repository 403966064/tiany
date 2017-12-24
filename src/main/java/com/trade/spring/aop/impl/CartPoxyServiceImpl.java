package com.trade.spring.aop.impl;

import com.trade.spring.aop.ICartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CartPoxyServiceImpl implements ICartService {
    @Resource(name = "cartServiceImpl")
    private ICartService cartService;
    @Override
    public void addShopping(String item) {
        System.out.println("在添加购物车之前的业务逻辑");
        cartService.addShopping(item);
        System.out.println("在添加购物车之后的业务逻辑");
    }
}
