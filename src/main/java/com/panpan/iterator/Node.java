package com.panpan.iterator;

import java.sql.SQLOutput;

/**
 * @className: Node
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/29 23:59
 * @version: 1.0
 */
public class Node<E> {
    E object;
    public Node next = null;
    public Node( E object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Node{" +
                "object=" + object +
                '}';
    }
}
