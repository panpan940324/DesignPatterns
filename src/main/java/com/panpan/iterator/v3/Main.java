package com.panpan.iterator.v3;

/**
 * @className: Main
 * @Decsription: 迭代器模式
 *  使用数组Array或者链表LinkedList来构建容器
 *  遍历ArrayList和LinkedList 使用迭代器的方式(内部类实现这个迭代器)--简单适用
 * @Author: 盼盼学Java
 * @Date: 2022/10/24 22:43
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        ArrayList_<Integer> arrayList_ = new ArrayList_<>();
        for (int i = 0; i < 12; i++) {
            arrayList_.add(i);
        }
        Iterater_ iterator = arrayList_.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(arrayList_.size());

        LinkedList_<Integer> linkedList_ = new LinkedList_<>();
        for (int i = 0; i  < 15; i++) {
            linkedList_.add(i);
        }
        Iterater_ iterator1 = linkedList_.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println(linkedList_.size());
    }
}
