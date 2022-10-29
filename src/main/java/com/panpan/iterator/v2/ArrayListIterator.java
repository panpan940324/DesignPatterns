package com.panpan.iterator.v2;

/**
 * @className: ArrayListIterator
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/30 0:18
 * @version: 1.0
 */
public class ArrayListIterator<E> implements Iterater_{
    private E[] objects;
    private int currentIndex = 0;
    private int size;

    public ArrayListIterator(E[] objects, int size) {
        this.objects = objects;
        this.size = size;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < size;
    }

    @Override
    public Object next() {
        if (currentIndex < size ) {
            E object = objects[currentIndex];
            currentIndex++;
            return object;
        }
        return null;
    }
}
