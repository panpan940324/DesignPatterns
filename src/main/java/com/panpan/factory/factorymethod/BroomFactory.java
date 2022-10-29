package com.panpan.factory.factorymethod;

/**
 * @className: BroomFactory
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/6 0:29
 * @version: 1.0
 */
public class BroomFactory {
    Moveable create() {
        return new Broom();
    }
}
