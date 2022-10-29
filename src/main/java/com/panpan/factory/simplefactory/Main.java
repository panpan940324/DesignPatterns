package com.panpan.factory.simplefactory;

/**
 * @className: Main
 * @Decsription: 简单工厂--工厂模式
 *  任何可以产生对象的方法或者类，都可以称之为工厂。
 *  单例其实也是一种工厂，静态工厂
 *  好处：灵活控制生成过程，权限，修饰和日志等等...
 * @Author: 盼盼学Java
 * @Date: 2022/10/5 23:25
 * @version: 1.0
 */
public class Main {

    public static void main(String[] args) {
        // 测试简单工厂
        Car car = new SimpleVehicleFactory().createCar();
        car.go();

    }
}
