/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

/**
 * @author Yue Chang
 * @ClassName: SimpleProxy
 * @Description: 代理模式示例
 * @date 2018/5/6 17:18
 */
public class SimpleProxy implements InvocationHandler{
    private Object proxyObject;

    /**
     * 构造子
     * @param proxyObject
     */
    public SimpleProxy(Object proxyObject) {
        this.proxyObject = proxyObject;
    }

    /**
     * 静态工厂
     * @param object
     * @return
     */
    public static Object factory(Object object){

        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                new SimpleProxy(object));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 方法执行之前的操作
        System.out.println("before calling \n" + method);
        // 参数信息
        if (args != null) {
            for (Object arg : args) {
                System.out.println(arg);
            }
        }
        Object object = method.invoke(proxyObject, args);
        // 方法执行之后的操作
        System.out.println("after calling \n" + method);
        return object;
    }

    public static void main(String[] args) {

        List list = (List) factory(new Vector<String>());
        list.add("New");
        list.add("York");

        System.out.println();

        Map map = (Map) factory(new HashMap<String, String>());
        map.put("key1", "value1");
        map.put("key2", "value2");
    }
}
/*
输出结果：
before calling
public abstract boolean java.util.List.add(java.lang.Object)
New
after calling
public abstract boolean java.util.List.add(java.lang.Object)
before calling
public abstract boolean java.util.List.add(java.lang.Object)
York
after calling
public abstract boolean java.util.List.add(java.lang.Object)

before calling
public abstract java.lang.Object java.util.Map.put(java.lang.Object,java.lang.Object)
key1
value1
after calling
public abstract java.lang.Object java.util.Map.put(java.lang.Object,java.lang.Object)
before calling
public abstract java.lang.Object java.util.Map.put(java.lang.Object,java.lang.Object)
key2
value2
after calling
public abstract java.lang.Object java.util.Map.put(java.lang.Object,java.lang.Object)
 */
