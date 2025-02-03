package com.ankan.access;

public class A {
    protected int num; // without public or while using protected, it won't allow in different packages. Same
    // package, it'll allow
    String name;
    int[] arr;

    // We can now access num using getter and setter method

    // getter gets the value
    public int getNum() {
        return num;
    }
    // setter sets the value
    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
