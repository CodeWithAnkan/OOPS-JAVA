package com.ankan.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human ankan = new Human(21, "Ankan");
//        Human twin = new Human(ankan); //creating a copy of ankan. Instead we can use object cloning.

        Human twin = (Human)ankan.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100; // for primitives, it does not create a copy of an array. It just points to the original
        // array. Even for String which is a primitive, it just points to the original name. This is shallow copying.

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(ankan.arr)); // very important
    }
}
