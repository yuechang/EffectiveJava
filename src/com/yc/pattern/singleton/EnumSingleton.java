package com.yc.pattern.singleton;

/**
 * 枚举单例
 * @author xyz327
 * @date 2017-06-05 12:47:58
 * @version 1.0
 */
public enum EnumSingleton {
    Instance;
    
    public static final EnumSingleton getInstance(){
        return EnumSingleton.Instance;
    }
}
