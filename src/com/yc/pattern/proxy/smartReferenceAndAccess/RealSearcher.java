/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.proxy.smartReferenceAndAccess;

/**
 * @author Yue Chang
 * @ClassName: RealSearcher
 * @Description: 真实主题
 * @date 2018/5/13 22:32
 */
public class RealSearcher implements Searcher{

    public RealSearcher() {
    }


    // 真实的查询发生在这里发生
    @Override
    public String doSearch(String userId, String searchType) {

        String sql = "SELECT * FROM data_table WHERE search_type = " + searchType + ";";
        // 执行SQL语句
        // 获得结果集
        return "result set";
    }
}

