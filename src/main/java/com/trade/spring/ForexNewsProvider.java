package com.trade.spring;

import com.trade.spring.entity.ForexNewsBean;
import com.trade.spring.service.IForexNewsListener;
import com.trade.spring.service.IForexNewsRegister;

/**
 * Created by tiany on 2017/12/20.
 */
public class ForexNewsProvider {
    private IForexNewsListener newsListener;
    private IForexNewsRegister newsRegister;

    /*public ForexNewsProvider(IForexNewsListener newsListener, IForexNewsRegister newsRegister) {
        this.newsListener = newsListener;
        this.newsRegister = newsRegister;
    }*/

    public IForexNewsListener getNewsListener() {
        return newsListener;
    }

    public void setNewsListener(IForexNewsListener newsListener) {
        this.newsListener = newsListener;
    }

    public IForexNewsRegister getNewsRegister() {
        return newsRegister;
    }

    public void setNewsRegister(IForexNewsRegister newsRegister) {
        this.newsRegister = newsRegister;
    }

    public void getAndRegisterNews(){
        String[] newsId = newsListener.getAvailableNewsIds();
        if(newsId == null || newsId.length == 0){
            return;
        }
        for(String news : newsId){
            ForexNewsBean forexNewsBean = newsListener.getNewsById(news);
            newsRegister.persistNews(forexNewsBean);
        }
    }
}
