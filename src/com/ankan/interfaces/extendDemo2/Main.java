package com.ankan.interfaces.extendDemo2;

public class Main implements A, B, C {
    // ek class se zyada default value nahi hosakta
    @Override
    public void greet() {

    }

    @Override
    public void meet() {

    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting(); // static methods are called using name of the class/interface
    }
}