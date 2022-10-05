package com.panpan.factory.abstractfactory;

/**
 * @className: Main
 * @Decsription: 抽象工厂
 *  任意定制产品
 *  任意定制产品的生成过程
 *  任务定制产品簇（一类产品）
 * @Author: 盼盼学Java
 * @Date: 2022/10/5 23:54
 * @version: 1.0
 */
public class Main {

    public static void main(String[] args) {
        // 定义现代军人
        ModernFactory modernFactory = new ModernFactory();
        Vehicle vehicle = modernFactory.createVehicle();
        vehicle.go();
        Weapon weapon = modernFactory.createWeapon();
        weapon.shoot();
        Food food = modernFactory.creatFood();
        food.printName();

        // 定义一个魔法世界的魔法人
        MagicFactory magicFactory = new MagicFactory();
        Vehicle vehicle2 = magicFactory.createVehicle();
        vehicle2.go();
        Weapon weapon2 = magicFactory.createWeapon();
        weapon2.shoot();
        Food food2 = magicFactory.creatFood();
        food2.printName();
    }

}
