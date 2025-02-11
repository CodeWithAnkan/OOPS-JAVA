package com.ankan.inheritance.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();

//        shape.area();
        square.area(); // we can that only reference variable can give access to the variables and methods, but in
        // polymorphism, it tells which one to run by overriding. This is known as Upcasting. And Java determines
        // which method to run by a process called ***Dynamic Method Dispatch***
    }

}
