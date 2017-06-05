package com.yc.pattern.singleton;

/**
 * 饿汉式单例
 * @author xyz327
 * @date 2017-06-05 12:45:20
 * @version 1.0
 */
public class HungerSingleton {
    private static HungerSingleton instance = new HungerSingleton();
    private HungerSingleton() {
    }
    
    public static final HungerSingleton getInstance(){
        return instance;
    }
}
