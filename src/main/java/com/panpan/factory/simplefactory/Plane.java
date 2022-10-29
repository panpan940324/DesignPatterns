package com.panpan.factory.simplefactory;

/**
 * @className: Plant
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/5 23:33
 * @version: 1.0
 */
public class Plane implements Moveable {
    @Override
    public void go() {
        System.out.println("Plane is going ...");
    }
}
