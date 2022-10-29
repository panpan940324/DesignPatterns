package com.panpan.proxy.v03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @className: Main
 * @Decsription: 代理模式--动态代理（jdk动态代理）
 * 可以进行嵌套代理
 * @Author: 盼盼学Java
 * @Date: 2022/10/16 23:53
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Tank tank = new Tank();
        // jdk1.8之后的版本
        // System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
        // jdk1.8以及之前的版本
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Movable movable = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(), Tank.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("---------开始记录日志---------");
                Object invoke = method.invoke(tank, args);
                System.out.println("---------结束记录日志---------");
                return invoke;
            }
        });
        movable.move();
    }
}
