package com.panpan.proxy.v01;

/**
 * @className: TankLogProxy
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/18 23:41
 * @version: 1.0
 */
public class TankLogProxy implements Movable {
    private Tank tank;

    public TankLogProxy(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void move() {
        System.out.println("---------开始记录日志---------");
        tank.move();
        System.out.println("---------结束记录日志---------");
    }
}
