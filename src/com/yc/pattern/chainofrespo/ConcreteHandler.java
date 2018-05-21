/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.chainofrespo;

/**
 * @author Yue Chang
 * @ClassName: ConcreteHandler
 * @Description: 具体处理者
 * @date 2018/5/21 22:45
 */
public class ConcreteHandler extends Handler {

    // 调用此方法处理请求
    @Override
    public void handleRequest() {

        if (getSuccessor() != null ) {

            System.out.println("The request is passed to " + getSuccessor());
            getSuccessor().handleRequest();
        } else {
            System.out.println("The request is handler here");
        }
    }
}

