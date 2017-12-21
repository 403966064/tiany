package com.trade.spring.service.impl;

import com.trade.spring.entity.ForexNewsBean;
import com.trade.spring.service.IForexNewsListener;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tiany on 2017/12/21.
 */
@Service
public class NasdakNewsListener implements IForexNewsListener {
    private static final String[] newsId = {"1", "2", "3"};
    private static final Map<String, ForexNewsBean> map = new HashMap<>();
    static{
        map.put("1", new ForexNewsBean("一种相思", "两处闲愁"));
        map.put("2", new ForexNewsBean("才下眉头", "却上心头"));
        map.put("3", new ForexNewsBean("人生若只如初见", "何事悲风秋画扇"));
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
