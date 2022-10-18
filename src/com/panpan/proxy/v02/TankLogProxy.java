package com.panpan.proxy.v02;

/**
 * @className: TankLogProxy
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/18 23:41
 * @version: 1.0
 */
public class TankLogProxy implements Movable {
    Movable m;

    public TankLogProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        System.out.println("---------开始记录日志---------");
        m.move();
        System.out.println("---------结束记录日志---------");
    }
}
