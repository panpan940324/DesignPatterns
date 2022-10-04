package com.panpan.singleton;

import sun.security.jca.GetInstance;

/**
 * @className: Mgr05
 * @Decsription: 对方法进行加锁的懒加载--单例
 *  对获取单例的方法进行懒加载
 *  缺点：存在线程安全的问题
 * @Author: 盼盼学Java
 * @Date: 2022/10/4 19:07
 * @version: 1.0
 */
public class Mgr05 {
    private static Mgr05 INSTANCE;
    private Mgr05() {}

    public static Mgr05 getInstance() {
        if (INSTANCE == null) {
            synchronized (Mgr05.class) {
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                    e.getStackTrace();
                }
                INSTANCE = new Mgr05();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                Mgr05 instance = Mgr05.getInstance();
                System.out.println(instance.hashCode());
            }).start();
        }
    }
}
