/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.chainofrespo;

/**
 * @author Yue Chang
 * @ClassName: Handler
 * @Description: 抽象处理者
 * @date 2018/5/21 22:07
 */
public abstract class Handler {

    // 处理方法，调用此方法处理请求
    protected Handler successor;
    public abstract void handleRequest();

    // 取值方法
    public Handler getSuccessor() {
        return successor;
    }

    // 赋值方法，调用此方法设定下家
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}

