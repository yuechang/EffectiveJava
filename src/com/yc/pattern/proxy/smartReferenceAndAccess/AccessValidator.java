/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.proxy.smartReferenceAndAccess;

/**
 * @author Yue Chang
 * @ClassName: AccessValidator
 * @Description: 检查权限对象
 * @date 2018/5/13 22:36
 */
public class AccessValidator {

    // 用户权限在这里检查
    public boolean validateUser(String userId) {
        return "Admin".equals(userId);
    }
}

