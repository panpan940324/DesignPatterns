package com.panpan.factory.factorymethod;

/**
 * @className: CarFactory
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/6 0:29
 * @version: 1.0
 */
public class CarFactory {
    Moveable create() {
        return new Car();
    }
}
