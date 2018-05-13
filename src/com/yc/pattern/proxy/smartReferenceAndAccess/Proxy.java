/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.proxy.smartReferenceAndAccess;

/**
 * @author Yue Chang
 * @ClassName: Proxy
 * @Description: 代理角色
 * @date 2018/5/13 22:28
 */
public class Proxy implements Searcher {

    private RealSearcher searcher;
    private UsageLogger usageLogger;
    private AccessValidator accessValidator;

    // 构造子
    public Proxy() {
        searcher = new RealSearcher();
    }

    @Override
    public String doSearch(String userId, String searchType) {

        if (checkAccess(userId)) {
            String result = searcher.doSearch(null, searchType);
            logUsage(userId);
            return result;
        }
        return null;
    }


    // 查询前的权限操作
    private boolean checkAccess(String userId) {
        accessValidator = new AccessValidator();
        return accessValidator.validateUser(userId);
    }

    // 查询前的日志操作
    private void logUsage(String userId) {
        usageLogger = new UsageLogger();
        usageLogger.setUserId(userId);
        usageLogger.save();
    }

}

