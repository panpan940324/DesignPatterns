package com.panpan.singleton;

import java.lang.annotation.Retention;

/**
 * @className: Mgr07
 * @Decsription: 静态内部类方式--单例
 *  JVM保证了单例，加载外部类时不会加载内部类，这样可以实现懒加载
 * @Author: 盼盼学Java
 * @Date: 2022/10/4 19:14
 * @version: 1.0
 */
public class Mgr07 {
    private Mgr07() {}
    private static class innerClass {
        public static final Mgr07 INSTACNE = new Mgr07();
    }
    public static Mgr07 getInstance() {
        return innerClass.INSTACNE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr07.getInstance().hashCode());
            }).start();
        }
    }
}
