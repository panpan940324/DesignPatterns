package com.panpan.singleton;

/**
 * @className: Mgr06
 * @Decsription: 双重检查的懒加载--单例模式
 * @Author: 盼盼学Java
 * @Date: 2022/10/4 19:10
 * @version: 1.0
 */
public class Mgr06 {
    private static volatile Mgr06 INSTANECE;
    private Mgr06() {}

    public static Mgr06 getInstance() {
        if (INSTANECE == null) {
            synchronized (Mgr06.class) {
                if (INSTANECE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                        e.getStackTrace();
                    }
                    INSTANECE = new Mgr06();
                }
            }
        }
        return INSTANECE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr06.getInstance().hashCode());
            }).start();
        }
    }
}
