package com.panpan.singleton;

import sun.security.jca.GetInstance;

/**
 * @className: Mgs04
 * @Decsription: 线程安全的懒加载--单例
 *  使用synchronized来保证线程安全
 *  缺点：对class对象进行加锁，执行效率变慢
 * @Author: 盼盼学Java
 * @Date: 2022/10/4 19:02
 * @version: 1.0
 */
public class Mgr04 {
    private static Mgr04 INSTANCE;
    private Mgr04() {}
    public static synchronized Mgr04 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            }catch (Exception e) {
                e.getStackTrace();
            }
            INSTANCE = new Mgr04();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                Mgr04 instance = Mgr04.getInstance();
                System.out.println(instance.hashCode());
            }).start();
        }
    }
}
