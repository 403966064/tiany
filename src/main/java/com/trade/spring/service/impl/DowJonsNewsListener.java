package com.trade.spring.service.impl;

import com.trade.spring.entity.ForexNewsBean;
import com.trade.spring.service.IForexNewsListener;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tiany on 2017/12/20.
 */
public class DowJonsNewsListener implements IForexNewsListener {
    private static final String[] newsId = {"1", "2", "3"};
    private static final Map<String, ForexNewsBean> map = new HashMap<>();
    static{
        map.put("1", new ForexNewsBean("欢天喜地迎国庆", "国庆假有7天"));
        map.put("2", new ForexNewsBean("欢天喜地迎圣诞", "圣诞节没有假"));
        map.put("3", new ForexNewsBean("欢天喜地迎元旦", "元旦假有3天"));
    }
    @Override
    public String[] getAvailableNewsIds() {
        return newsId;
    }

    @Override
    public ForexNewsBean getNewsById(String newsId) {
        return map.get(newsId);
    }
}
