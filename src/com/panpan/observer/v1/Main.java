package com.panpan.observer.v1;

/**
 * @className: Main
 * @Decsription: 观察者模式
 *  在对象之间定义一个一对多的依赖，当一个对象状态改变的时候，所有依赖的对象都会得到通知并自动更新
 * @Author: 盼盼学Java
 * @Date: 2022/10/10 0:15
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver concreteObserver = new ConcreteObserver();
        concreteSubject.addObserver(concreteObserver);
        concreteSubject.notifyObservers();
    }
}
