package com.panpan.observer.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: Subject
 * @Decsription: 被观察者（抽象类）
 * @Author: 盼盼学Java
 * @Date: 2022/10/11 0:15
 * @version: 1.0
 */
public abstract class Subject {
    // 定义一个被观察者数组
    private List<Observer> observers = new ArrayList<>();

    // 增加观察者的方法
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // 删除观察者的方法
    public void delObserver(Observer observer) {
        observers.remove(observer);
    }

    // 通知所有观察者的方法
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
