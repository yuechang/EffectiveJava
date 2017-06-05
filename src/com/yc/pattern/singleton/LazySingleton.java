package com.yc.pattern.singleton;

/**
 * 懒汉式单例 (双重加锁检查)
 * @author xyz327
 * @date 2017-06-05 12:43:39
 * @version 1.0
 */
public class LazySingleton {
    private static LazySingleton instance = null;
    private LazySingleton() {
    }
    public static final LazySingleton getInstacne(){
        if(instance == null){
            synchronized (LazySingleton.class) {
                if(instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
