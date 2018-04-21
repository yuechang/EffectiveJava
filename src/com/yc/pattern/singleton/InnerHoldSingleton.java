package com.yc.pattern.singleton;

/**
 * 静态内部类单例
 * @author xyz327
 * @date 2017-06-05 12:53:34
 * @version 1.0
 */
public class InnerHoldSingleton {
    private static class InstanceHolder {
        private final static InnerHoldSingleton instance = new InnerHoldSingleton();
    }
    private InnerHoldSingleton(){
    }
    
    public static final InnerHoldSingleton getInstance(){
        return InstanceHolder.instance;
    }
}
