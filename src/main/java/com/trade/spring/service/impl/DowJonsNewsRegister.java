package com.trade.spring.service.impl;

import com.trade.spring.entity.ForexNewsBean;
import com.trade.spring.service.IForexNewsRegister;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tiany on 2017/12/20.
 */
public class DowJonsNewsRegister implements IForexNewsRegister {
    private static final List<ForexNewsBean> list = new ArrayList<>();

    @Override
    public void persistNews(ForexNewsBean forexNewsBean) {
        if(!list.contains(forexNewsBean)){
            list.add(forexNewsBean);
        }
        System.out.println(list.toString());
    }
}
