package com.panpan.strategy;

/**
 * @className: CompareDogWeightStragegy
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/5 19:03
 * @version: 1.0
 */
public class CompareDogWeightStrategy implements Comparator<Dog>{
    @Override
    public int compare(Dog d1, Dog d2) {
        return Integer.compare(d1.weight, d2.weight);
    }
}
