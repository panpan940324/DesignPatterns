package com.panpan.proxy.v05;

import java.util.Random;

/**
 * @className: Tank
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/18 23:28
 * @version: 1.0
 */
public class Tank {

    public void move() {
        System.out.println("坦克---");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
