/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.command;

/**
 * @author Yue Chang
 * @ClassName: Stereo
 * @Description: 音响对象
 * @date 2017/7/9 22:52
 */
public class Stereo {

    private String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println("打开"+ location +"音响");
    }

    public void off(){
        System.out.println("关闭"+ location +"音响");
    }

    public void setCd(){
        System.out.println("设置"+ location +"CD");
    }

    public void setDvd(){
        System.out.println("设置"+ location +"DVD");
    }

    public void setRadio(){
        System.out.println("打开"+ location +"录音机");
    }

    public void setVolume(int volume){
        System.out.println("设置"+ location +"声音为"+volume);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

