package com.panpan.factory.abstractfactory;

/**
 * @className: MagicStick
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/6 0:14
 * @version: 1.0
 */
public class MagicStick extends Weapon{
    @Override
    void shoot() {
        System.out.println("MagicStick is shooting ~~~");
    }
}
