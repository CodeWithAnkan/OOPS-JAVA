package com.ankan.properties.inheritance;

public class Box {
    // private double l; private variable can be accessed from this file only. It cannot be initialised from another
    // file.
    double l;
    double h;
    double w;

    static void greeting() {
        System.out.println("Hey, I am in Box class. Greetings!");
    }

    Box () {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    // cube
    Box (double side) {

        // super(); Object class

        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public void information () {
        System.out.println("Running the box");
    }

    public void volume () {
        double result = l * w * h;
    }
}
