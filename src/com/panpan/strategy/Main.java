package com.panpan.strategy;

import java.util.Arrays;

/**
 * @className: Main
 * @Decsription: 策略模式
 *  其属于行为模式的一种，
 *  其用意是针对一组算法，将每一种算法封装到具有相同接口的独立类中，从而使得它们可以相互替代。
 *  策略模式使得算法可以在不影响客户端的情况下相互替代。
 * @Author: 盼盼学Java
 * @Date: 2022/10/5 16:12
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        /*Comparable[] arr = {new Cat(1), new Cat(3), new Cat(2)};
        System.out.println(Arrays.toString(arr));
        Sorter.sort(arr);
        System.out.println(Arrays.toString(arr));*/

        // 策略模式
        Dog[] arr = {new Dog(2,2), new Dog(1,3), new Dog(3,1)};
        System.out.println(Arrays.toString(arr));
        SorterV2<Dog> sorterV2 = new SorterV2<>();
        sorterV2.sort(arr, new CompareDogWeightStrategy());
        System.out.println(Arrays.toString(arr));
        sorterV2.sort(arr, new CompareDogHeightStrategy());
        System.out.println(Arrays.toString(arr));
    }
}
