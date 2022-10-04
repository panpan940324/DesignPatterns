package com.panpan.singleton;

/**
 * @className: Mgr01
 * @Decsription: 饿汉模式--单例
 *  类加载到内存之后，就实例化一个单例，JVM保证线程安全
 *  简单实用，推荐使用
 *  唯一缺点：不管用到与否，类装载时就完成实例化
 * @Author: 盼盼学Java
 * @Date: 2022/10/4 18:24
 * @version: 1.0
 */
public class Mgr01 {
    private static final Mgr01 instance = new Mgr01();
    // 该类以外的对象没有办法创建Mgr01对象
    private Mgr01() {};

    /**
     * 给外界提供一个获取Mgr01单例对象的方法
     * @return Mgr01单例对象
     */
    public static Mgr01 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Mgr01 instance1 = Mgr01.getInstance();
        Mgr01 instance2 = Mgr01.getInstance();
        System.out.println(instance1 == instance2);
    }
}
