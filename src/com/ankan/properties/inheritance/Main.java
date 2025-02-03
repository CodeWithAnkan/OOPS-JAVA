package com.ankan.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(51, 31, 77);

        System.out.println(box.l + " x " + box.w + " x " + box.h);
        // System.out.println(box.weight); // child can access extra variables that are in the parent. But if the object
        // is created in the parent class, it cannot access the child properties

        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(2,3,4,8);
        System.out.println(box3.weight + " " + box3.h + " " + box3.w + " " + box3.l);

        Box box5 = new BoxWeight(2, 3, 4, 8);
        // System.out.println(box5.weight); // It is the referencial variable not the object that determines what
        // members can be accessed. box5 is stack memory, points to boxweight in heap memory
        System.out.println(box5.w);

        /*
        there are many variables in both parent and child classes. we are given access to variables that are in the
        ref type i.e BoxWeight. hence, we have access to the weight variable. this also means, that the ones we are
        trying to access should be initialised. but here, when the obj itself is of type parent class, how we can
        call the constructor of child class. this is why it's giving error

        BoxWeight box6 = new Box(2, 3, 4);
        System.out.println(box6);
        */

        BoxPrice box6 = new BoxPrice(5, 8, 90);

        Box box7 = new BoxWeight();
        box7.greeting(); // Static methods cannot be override. Because override depends on object but static doesn't.

        BoxWeight box8 = new BoxWeight();
        box8.greeting();

        // Static methods can be inherited but cannot be overriden. Here BoxWeight inherits the greeting method as it
        // is static
    }
}
