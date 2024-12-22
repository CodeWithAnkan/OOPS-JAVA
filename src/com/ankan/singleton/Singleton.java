package com.ankan.singleton;

public class Singleton {
    private int num = 0;
    private Singleton () { // private restricts from creating multiple objects

    }

    private static Singleton instance; // This is a static variable that will hold the single instance of the Singleton class.Being static ensures that the variable is shared across all instances of the class, but since the constructor is private, only the Singleton class itself can assign a value to it.

    public static synchronized Singleton getInstance() {
        // check whether 1 object only is created or not
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
/*
class Example {
    Singleton.instance = new Singleton();
}

SINCE INSTANCE IS PRIVATE, IT CAN'T BE ACCESSED OUTSIDE THE SINGLETON CLASS. SINCE SINGLETON CONSTRUCTOR IS PRIVATE
IT CANNOT CREATE A NEW OBJECT OUTSIDE THE SINGLETON CLASS.
*/