package com.ankan.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

//    @Override
//    static void greeting() {
//        System.out.println("Hey, I am in BoxWeight class. Greetings!");
//    }

    BoxWeight (BoxWeight other) {
        super (other);
        // same as Box box5 = new BoxWeight (2, 3, 4, 8) because super now points to the parent class constructor ->
        // Box(Box old) {...}.
        this.weight = other.weight;
        // System.out.println(super.weight); It is the referencial variable not the object that determines what members can be
        //accessed.
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // calling the parent class constructor. (Ctrl + Click) on super to see
        this.weight = weight;
        System.out.println(this.w);
        System.out.println(super.w);
    }

    public BoxWeight(Box old, double weight) {
        super(old);
        this.weight = weight;
    }
}
