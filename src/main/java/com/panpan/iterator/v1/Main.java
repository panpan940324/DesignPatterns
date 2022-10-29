package com.panpan.iterator.v1;

/**
 * @className: Main
 * @Decsription: 迭代器模式
 *  使用数组Array或者链表LinkedList来构建容器
 * @Author: 盼盼学Java
 * @Date: 2022/10/24 22:43
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        ArrayList_<Integer> arrayList_ = new ArrayList_<Integer>();
        for (int i = 0; i < 15; i++) {
            arrayList_.add(i);
        }
        System.out.println(arrayList_.size());

        LinkedList_<Integer> linkedList_ = new LinkedList_<>();
        for (int i = 0; i  < 15; i++) {
            linkedList_.add(i);
        }
        System.out.println(linkedList_.size());
    }
}
