/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.proxy.smartReferenceAndAccess;

/**
 * @author Yue Chang
 * @ClassName: Client
 * @Description: 客户端代码
 * @date 2018/5/13 22:27
 */
public class Client {

    private static Searcher searcher;

    public static void main(String[] args) {

        // 此静态变量的真实类型是Proxy
        searcher = new Proxy();

        String result = searcher.doSearch("Admin", "SEARCH_BY_ACCOUNT_NUMBER");
        System.out.println(result);
    }
}

