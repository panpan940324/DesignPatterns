package com.panpan.strategy;

/**
 * @className: CompareDogHeightStrategy
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/5 19:08
 * @version: 1.0
 */
public class CompareDogHeightStrategy implements Comparator<Dog> {
    @Override
    public int compare(Dog d1, Dog d2) {
        return Integer.compare(d1.height, d2.height);
    }
}
