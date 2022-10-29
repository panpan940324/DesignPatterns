package com.panpan.proxy.v02;

import java.lang.reflect.Method;

/**
 * @className: Main
 * @Decsription: 代理模式--静态代理（非常像装饰者模式）
 *  可以进行嵌套代理
 * @Author: 盼盼学Java
 * @Date: 2022/10/16 23:53
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        // TankTimeProxy 首先代理 tank，然后 TankLogProxy 在去代理TankTimeProxy
        TankLogProxy tankLogProxy = new TankLogProxy(new TankTimeProxy(new Tank()));
        tankLogProxy.move();
    }
}
