package com.panpan.factory.simplefactory;

/**
 * @className: SimpleVehicleFactory
 * @Decsription: 简单工厂
 *  可以生产对象的工厂，但是不利于扩展，每增加一个新的交通工具需要重新修改这个类
 * @Author: 盼盼学Java
 * @Date: 2022/10/5 23:41
 * @version: 1.0
 */
public class SimpleVehicleFactory {
    public Car createCar() {
        return new Car();
    }

    public Plane createPlane() {
        return new Plane();
    }

    public Broom createBroom() {
        return new Broom();
    }
}
