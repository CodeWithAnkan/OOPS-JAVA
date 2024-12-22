package com.ankan.staticExample;

import static com.ankan.packages.b.Greeting.Greeting.Greeting;

class Car {
    String brand;
    String color;
    int speed;

    void drive() { // Methods
        System.out.println(brand + " is driving at " + speed + " km/hr");
    }

    void stop() { // Methods
        System.out.println(brand + " stopped");
    }

    public Car (String brand, String color, int speed) { // constructor
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }
}
public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(22, "Kunal", 100000, false);
        Human ankan = new Human(21, "Ankan", 200000, false);
        Human arpit = new Human(25, "Arpit", 50000, true);

        // System.out.println(kunal.population); do not do it
        System.out.println(Human.population);

        Greeting("Ankan"); // calling public static void Greeting (String name){}

        Car car1 = new Car("Toyota", "blue", 85); // object
        Car car2 = new Car("Bentley", "silver-white", 120); // object

        car1.drive();
        car2.drive();
    }

        // this is not dependent on objects
        static void fun() {
            Main obj = new Main();
            System.out.println("Hi!");
            // greeting(); // cannot access non-static function from static method
        }


    // we know that something which is not static belongs to an object
    void greeting() {
        fun(); // static variable can be called from non-static
        System.out.println("Hello World");
    }
}
