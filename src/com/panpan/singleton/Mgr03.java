package com.panpan.singleton;

/**
 * @className: Mgr03
 * @Decsription: 懒汉式--单例
 *  在需要实例的时候创建对象
 *  缺点：虽然达到了按需初始化的目的，但却带来了线程不安全的问题
 * @Author: 盼盼学Java
 * @Date: 2022/10/4 18:48
 * @version: 1.0
 */
public class Mgr03 {
    private static Mgr03 INSTANCE;
    private Mgr03(){}

    public static Mgr03 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                e.getStackTrace();
            }
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                Mgr03 instance = Mgr03.getInstance();
                System.out.println(instance.hashCode());
            }).start();
        }
    }

}
