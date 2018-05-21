/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.chainofrespo;

/**
 * @author Yue Chang
 * @ClassName: Client
 * @Description: 客户端
 * @date 2018/5/21 22:51
 */
public class Client {

    static private Handler handler1,handler2;

    public static void main(String[] args) {
        handler1 = new ConcreteHandler();
        handler2 = new ConcreteHandler();
        handler1.setSuccessor(handler2);
        handler1.handleRequest();
    }
}

