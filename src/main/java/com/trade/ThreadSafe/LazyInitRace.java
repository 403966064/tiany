package com.trade.ThreadSafe;

/**
 * 单例模式－懒加载
 */
public class LazyInitRace {
    private Pojo instance = null;

    public Pojo getInstance(){
        if(instance == null){
            System.out.println("创建一个新对象");
            instance = new Pojo(null);
        }
        return instance;
    }
}
