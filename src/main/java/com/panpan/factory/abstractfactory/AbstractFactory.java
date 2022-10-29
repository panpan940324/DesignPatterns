package com.panpan.factory.abstractfactory;

/**
 * @className: AbstractFactory
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/6 0:19
 * @version: 1.0
 */
public abstract class AbstractFactory {

    abstract Vehicle createVehicle();

    abstract Weapon createWeapon();

    abstract Food creatFood();
}
