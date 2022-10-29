package com.panpan.strategy;

/**
 * @className: Sorter
 * @Decsription: 排序方法
 * @Author: 盼盼学Java
 * @Date: 2022/10/5 16:29
 * @version: 1.0
 */
public class Sorter {

    public static void sort(Comparable[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for ( int j = i + 1; j < length; j++) {
               if (arr[i].compareTo(arr[j]) > 0) {
                   swap(arr, i, j);
               }
            }
        }
    }

    private static void swap(Comparable[] arr, int i, int j) {
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
