package com.panpan.proxy.v05;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @className: Main
 * @Decsription: 代理模式--动态代理（CGLIB动态代理）
 * 可以进行嵌套代理
 * @Author: 盼盼学Java
 * @Date: 2022/10/16 23:53
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        // System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");
        // System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        // 输出CGLib的代理类
        // System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "F:\\class");
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new LogMethodInterceptor());
        Tank tank = (Tank) enhancer.create();
        tank.move();
    }
}

class LogMethodInterceptor implements MethodInterceptor {
    private void before() {
        System.out.println("---------开始记录日志---------");
    }

    private void after() {
        System.out.println("---------结束记录日志---------");
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object invoke = methodProxy.invokeSuper(o, objects);
        after();
        return invoke;
    }
}



