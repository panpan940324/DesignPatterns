package com.panpan.proxy.v02;

/**
 * @className: TankTimeProxy
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/18 23:33
 * @version: 1.0
 */
public class TankTimeProxy implements Movable {
    Movable m;

    public TankTimeProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        System.out.println("记录开始时间:" + startTime);
        m.move();
        long endTime = System.currentTimeMillis();
        System.out.println("记录结束时间:" + endTime);
        System.out.println("该方法花费的时间:" + (endTime-startTime));
    }
}
