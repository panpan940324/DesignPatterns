package com.panpan.strategy;

/**
 * @className: Dog
 * @Decsription: TODO
 * @Author: 盼盼学Java
 * @Date: 2022/10/5 18:58
 * @version: 1.0
 */
public class Dog {
    public  int weight;
    public int height;

    public Dog() {}
    public Dog(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
