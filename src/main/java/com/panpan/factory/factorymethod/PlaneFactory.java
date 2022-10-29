package com.panpan.factory.factorymethod;

/**
 * @className: PlantFatory
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/6 0:30
 * @version: 1.0
 */
public class PlaneFactory {
    Moveable create() {
        return new Plane();
    }
}
