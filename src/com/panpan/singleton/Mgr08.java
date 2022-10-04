package com.panpan.singleton;

/**
 * @className: Mgr08
 * @Decsription: 枚举类--单例
 *  不仅可以解决同步问题，还可以防止反序列化
 *  枚举类不会被反序列化，是因为枚举类没有构造方法
 * @Author: 盼盼学Java
 * @Date: 2022/10/4 19:19
 * @version: 1.0
 */
public enum Mgr08 {
    INSTANCE;
    public void m() {}

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr08.INSTANCE.hashCode());
            }).start();
        }
    }
}
