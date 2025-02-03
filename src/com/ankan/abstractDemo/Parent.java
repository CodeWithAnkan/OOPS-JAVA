package com.ankan.abstractDemo;

public abstract class Parent { // also we can't use final because final prevents inheritance

    int age;
    final int VALUE;

    public Parent(int age) {
        this.age = age;
        VALUE = 12345;
    }

    static void hello() {
        System.out.println("Hey");
    }

    void normal() {
        System.out.println("This is a normal method");
    }

//    abstract Parent(){} // can't create abstract constructors
//    abstract static void Parent() { // can't create abstract static methods because static methods cannot be
//    overridden in a subclass.
//
//    }

    abstract void career();
    abstract void partner();
}
