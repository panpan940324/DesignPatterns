package com.panpan.strategy;

/**
 * @className: Cat
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/5 18:33
 * @version: 1.0
 */
public class Cat implements Comparable<Cat> {
    private int weight;
    private int height;

    public Cat() {}
    public Cat(int weight) {
        this.weight = weight;
    }
    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public int compareTo(Cat o) {
        return Integer.compare(this.weight, o.weight);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                '}';
    }
}
