/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.command;

/**
 * @author Yue Chang
 * @ClassName: Command
 * @Description: 命令接口
 * @date 2017/7/9 20:53
 */
public interface Command {
    void execute();
    void undo();
}
