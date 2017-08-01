/*!
 * Copyright(c) 2017 Yue Chang
 * MIT Licensed
 */
package com.yc.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yue Chang
 * @ClassName: WeatherData
 * @Description: 气象数据
 * @date 2017/8/1 11:41
 */
public class WeatherData implements Subject{

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    /**
     * 当注册观察者是，我们只要把它加到ArrayList的后面即可
     * @param observer 观察者对象
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 同样地，当观察者想取消注册，我们把它从ArrayList中删除即可
     * @param observer 观察者对象
     */
    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i >= 0){
            observers.remove(i);
        }
    }


    /**
     * 我们把状态告诉每一个观察者。因为观察者都实现了update()，所以我们知道如何通知它们
     */
    @Override
    public void notifyObservers() {
        for (Observer observer:observers)
            observer.update(temperature, humidity, pressure);
    }

    /**
     * 当从气象站得到更新观测值时，我们通知观察者
     */
    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
