package com.ankan.abstractDemo;

public class Son extends Parent{

    public Son(int age) {
        super(age);
        int value = super.VALUE;
    }

    @Override
    void normal() {
        super.normal();
        System.out.println("Hello I am normal");
    }

    @Override
    void career() {
        System.out.println("I am going to be an engineer");
    }

    @Override
    void partner() {
        System.out.println("I love Loki");
    }
}