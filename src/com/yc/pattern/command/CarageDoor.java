/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.command;

/**
 * @author Yue Chang
 * @ClassName: GarageDoot
 * @Description: 车库的门对象
 * @date 2017/7/9 21:13
 */
public class CarageDoor {

    public void up(){
        System.out.println("打开车库门");
    }

    public void down(){
        System.out.println("关闭车库门");
    }

    public void stop(){
        System.out.println("停止车库门");
    }
    public void lightOn(){

    }

    public void lightOff(){

    }

}

