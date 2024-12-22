package com.ankan.staticExample;

public class Human { // class
    int age; // instance variable
    String name; // instance variable
    int salary; // instance variable
    boolean married;
    static long population; // static is used when some variable doesn't depend on the object but are common to all the
    // objects of that class. When a member is declared static, it can be accessed before any of the object of the
    // class being created and without referencing to that object
    public Human(int age, String name, int salary, boolean married) { // constructor
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1; // since this refers to a particular object, but population is common to all objects
        // so we use the className directly. Here it is Human.
    }
}
