package com.panpan.observer.v1;

/**
 * @className: ConcreteObserver
 * @Decsription: 具体的观察者
 * @Author: 盼盼学Java
 * @Date: 2022/10/11 0:14
 * @version: 1.0
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("我要更新数据！！");
    }
}
