package com.panpan.iterator.v3;


import com.panpan.iterator.Node;

/**
 * @className: LinkedList
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/29 23:47
 * @version: 1.0
 */
public class LinkedList_<E> implements Collection_<E> {
    // 定义这个LinkedList链表头部和尾部
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    @Override
    public void add(E o) {
        Node node = new Node(o);
        if (head == null) {
            head = node;
        }else {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterater_ iterator() {
        return new iter();
    }

    private class iter implements Iterater_ {
        private int currentSize = 0;
        private Node currentNode;

        @Override
        public boolean hasNext() {
            return currentSize < size;
        }

        @Override
        public Object next() {
            Node temp;
            if (currentSize == 0) {
                temp =  head;
                currentNode = head.next;
                currentSize++;
                return temp;
            } else if (currentSize < size) {
                temp =  currentNode;
                currentNode = currentNode.next;
                currentSize++;
                return temp;
            }
            else {
                return null;
            }
        }
    }
}
