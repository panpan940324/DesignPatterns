package com.panpan.strategy;

/**
 * @className: SorterV2
 * @Decsription: 策略模式--比较器
 * @Author: 盼盼学Java
 * @Date: 2022/10/5 18:52
 * @version: 1.0
 */
public class SorterV2<T> {

    public  void sort(T[] arr, Comparator<T> comparator) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for ( int j = i + 1; j < length; j++) {
                if (comparator.compare(arr[i], arr[j]) > 0) {
                    swap(arr, i, j);
                }
            }
        }
    }

    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
