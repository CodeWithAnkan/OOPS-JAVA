package com.ankan.introduction;

public class WrapperClass {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 30;
//
//        Integer num = 45;

        A pair = new A(10, 30);
        swap(pair);

        System.out.println(pair.a + " " + pair.b);

        final int bonus = 2; // using final fixes the value of the variable
        // bonus = 3; can't be done

        // final A Kunal = new A("Kunal Kushwaha");
        // Kunal.name = "Ankan";
        // When final is used for non-primitive data-types, their instances can be changed but the
        // object itself cannot be changed.
        // Kunal = new com.ankan.com.ankan.packages.A("new object");


    }
    static void swap (A pair) {
        int temp = pair.a;
        pair.a = pair.b;
        pair.b = temp;
    } // Since the swap didn't work, we use a wrapper class.
    // final student Kunal = new Student ()
    // Kunal.name = "new-name"; can be done
    // But Kunal = other object cannot happen
}

class A { // wrapper class
    final int num = 10; // final variable needs to be initialised first. final used for primitive data-types; their
    // values
    // can't be changed. But when final is used for non-primitive data-types, their instances can be changed but the
    // object itself cannot be changed.
    Integer a, b;  // When final is used for non-primitive data-types, their instances can be changed but the object
    // itself cannot be changed. But when an object is used as fields inside another object, it can be changed, as it
    // changes the reference to the object A, not the Integer object itself.

    public A(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}