package com.panpan.proxy.v01;

/**
 * @className: Main
 * @Decsription: 代理模式--简单的，只能完成一种功能
 * @Author: 盼盼学Java
 * @Date: 2022/10/16 23:53
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        new TankLogProxy(new Tank()).move();
        new TankTimeProxy(new Tank()).move();
    }
}
