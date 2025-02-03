package com.ankan.interfaces.extendDemo2;

public interface A {
    // static interface methods should always have a body
    static void greeting() {
        System.out.println("Hey I am a static method");
    }

    default void fun() {
        System.out.println("I am in A");
    }
}
