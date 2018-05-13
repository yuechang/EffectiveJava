/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.proxy.smartReferenceAndAccess;

/**
 * @author Yue Chang
 * @ClassName: UsageLogger
 * @Description: 记录次数的UsageLogger
 * @date 2018/5/13 22:40
 */
public class UsageLogger {

    private String userId;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void save() {

        String sql = "INSERT INTO USAGE_TABLE(userId)" + "VALUES(" + userId + ")";
        // 执行SQL语句
    }

    // 将这次记录加到日志中
    public void save(String userId) {
        this.userId = userId;
        save();
    }
}

