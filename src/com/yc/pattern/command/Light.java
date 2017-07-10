/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.command;

/**
 * @author Yue Chang
 * @ClassName: Light
 * @Description: 电灯对象
 * @date 2017/7/9 20:56
 */
public class Light {

    private String location;

    public Light(String location) {
        this.location = location;
    }

    /**
     * 打开电灯
     */
    public void on(){
        System.out.println("打开"+ location +"电灯.");
    }

    /**
     * 关闭电灯
     */
    public void off(){
        System.out.println("关闭"+ location +"电灯.");
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

