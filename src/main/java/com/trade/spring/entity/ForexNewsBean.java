package com.trade.spring.entity;

/**
 * Created by tiany on 2017/12/20.
 */
public class ForexNewsBean {
    private String title;

    private String content;

    public ForexNewsBean(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(obj instanceof ForexNewsBean){
            ForexNewsBean forexNewsBean = (ForexNewsBean) obj;
            if(forexNewsBean.title.equals(title) && forexNewsBean.content.equals(content)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "title:"+title +",content:"+content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
