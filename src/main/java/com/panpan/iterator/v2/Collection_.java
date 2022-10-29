package com.panpan.iterator.v2;

/**
 * @className: Collection_
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/24 23:07
 * @version: 1.0
 */
public interface Collection_<E> {
    void add(E o);
    int size();
    Iterater_ iterator();
}
