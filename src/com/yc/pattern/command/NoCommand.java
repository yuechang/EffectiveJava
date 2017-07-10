/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.command;

/**
 * @author Yue Chang
 * @ClassName: NoCommand
 * @Description: 空命令对象
 * @date 2017/7/9 22:37
 */
public class NoCommand implements Command {

    @Override
    public void execute() {}

    @Override
    public void undo() {}
}

