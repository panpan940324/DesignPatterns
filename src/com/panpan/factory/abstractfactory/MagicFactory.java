package com.panpan.factory.abstractfactory;

/**
 * @className: MagicFactory
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/6 0:22
 * @version: 1.0
 */
public class MagicFactory extends AbstractFactory{
    @Override
    Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    Weapon createWeapon() {
        return new MagicStick();
    }

    @Override
    Food creatFood() {
        return new MushRoom();
    }
}
