package com.panpan.factory.factorymethod;

/**
 * @className: Car
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/5 23:32
 * @version: 1.0
 */
public class Car implements Moveable {
    @Override
    public void go() {
        System.out.println("Car is going ...");
    }
}
