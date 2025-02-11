package com.ankan.inheritance.polymorphism;

public class Circle extends Shapes {
    @Override // this is called annotation

    // this will run when obj of circle is created. Hence, it is overriding the parent method
    void area() {
        System.out.println("Area is pi * r * r");
    }
}
