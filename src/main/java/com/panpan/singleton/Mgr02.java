package com.panpan.singleton;

/**
 * @className: Mgr02
 * @Decsription: 饿汉模式2
 *  和饿汉模式1一样，只是使用静态代码块来创建对象
 * @Author: 盼盼学Java
 * @Date: 2022/10/4 18:39
 * @version: 1.0
 */
public class Mgr02 {

    private static final Mgr02 instance;
    static {
        instance = new Mgr02();
    }
    // 该类以外的对象没有办法创建Mgr01对象
    private Mgr02() {};

    /**
     * 给外界提供一个获取Mgr01单例对象的方法
     * @return Mgr01单例对象
     */
    public static Mgr02 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Mgr02 instance1 = Mgr02.getInstance();
        Mgr02 instance2 = Mgr02.getInstance();
        System.out.println(instance1 == instance2);
    }
}
