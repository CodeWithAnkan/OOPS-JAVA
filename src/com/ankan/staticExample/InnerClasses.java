package com.ankan.staticExample;

//class Test { // ***
//    static String name;
//    public Test(String name) {
//        Test.name = name;
//    }
//}

public class InnerClasses { // outside classes cannot be static
    static class Test { // inner classes can be static. Doesn't depend on the instance of Parent Class.
        String name;
        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");
        // Here we can independently create objects without depending on the instance of the outer class.

        /*
        InnerClasses outer = new InnerClasses();
        InnerClasses.Test c = outer.new Test("Kunal");
        When the inner class (Test) is not static, we need to create an instance of the enclosing class and then use it to create an inner class object
        */

        System.out.println(a.name);
        System.out.println(b.name);
        //*** Static variables are shared among all instances of a class. They belong to the class itself rather than
        // to any specific object.
        // When you assign a value to Test.name, it overwrites the previous value of the name variable for all
        // instances of the Test class.

        // A non-static inner class depends on the instance of the outer class because:
        //A non-static inner class is tied to the outer class.
        //It might need access to the non-static variables or methods of the outer class, which are only available through an instance of that class.
    }
}