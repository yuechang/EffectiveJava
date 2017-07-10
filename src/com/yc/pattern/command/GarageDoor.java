/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.command;

/**
 * @author Yue Chang
 * @Classlocation: GarageDoor
 * @Description: 车库的门对象
 * @date 2017/7/9 21:13
 */
public class GarageDoor {

    private String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up(){
        System.out.println("打开"+location+"车库门");
    }

    public void down(){
        System.out.println("关闭"+location+"车库门");
    }

    public void stop(){
        System.out.println("停止"+location+"车库门");
    }

    public void lightOn(){
        System.out.println("打开"+ location + "车库灯");
    }

    public void lightOff(){System.out.println("关闭" + location + "车库灯" ); }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

