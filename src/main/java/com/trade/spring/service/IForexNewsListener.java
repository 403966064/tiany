package com.trade.spring.service;

import com.trade.spring.entity.ForexNewsBean;

/**
 * Created by tiany on 2017/12/20.
 */
public interface IForexNewsListener {
    String[] getAvailableNewsIds();

    ForexNewsBean getNewsById(String newsId);
}
