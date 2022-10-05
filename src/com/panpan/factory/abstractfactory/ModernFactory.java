package com.panpan.factory.abstractfactory;

/**
 * @className: ModernFactory
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/6 0:21
 * @version: 1.0
 */
public class ModernFactory extends AbstractFactory{
    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }

    @Override
    Food creatFood() {
        return new Bread();
    }
}
