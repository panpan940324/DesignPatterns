package com.panpan.iterator.v2;

/**
 * @className: ArrayList_
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/24 23:07
 * @version: 1.0
 */
public class ArrayList_<E> implements Collection_<E> {
    private E[] objects = (E[]) new Object[10];
    private int index = 0;

    @Override
    public void add(E o) {
        if (index == objects.length) {
            E[] newObjects = (E[]) new Object[index * 2];
            System.arraycopy(objects, 0, newObjects, 0, objects.length);
            objects = newObjects;
        }
        objects[index] = o;
        index++;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public Iterater_ iterator() {
        return new ArrayListIterator<>(objects, index);
    }
}
