/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.proxy.smartReferenceAndAccess;

/**
 * @author Yue Chang
 * @ClassName: Searcher
 * @Description: 抽象主题角色
 * @date 2018/5/13 22:27
 */
public interface Searcher {
    String doSearch(String userId, String searchType);
}

