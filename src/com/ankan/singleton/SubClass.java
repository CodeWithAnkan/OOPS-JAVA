package com.ankan.singleton;

import com.ankan.access.A;

public class SubClass extends A {
    boolean single;

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(45, "Ankan");
        int n = obj.num;

        A obj1 = new A(45, "Kunal");
//        int m = obj1.num; // error because only Subclass can access it, not the parent class. Because child know
//        what is above, but parent doesn't have any idea what is used in child

    }
}

class SubSubclass extends SubClass {
    public SubSubclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubclass obj = new SubSubclass(45, "Dim");
        int n = obj.num;
    }
}

class SubClass2 extends A {
    boolean single;

    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(45, "Ankan");
        int n = obj.num; // here we cannot access num from SubClass class because SubClass has no idea about SubClass2.
        /*
        *                 A
        *               /   \
        *              /     \
        *         SubClass  SubClass2
        *
        * */
    }
}