package com.ankan.enumExamples;

public class Basic {

    enum Week implements A {
        // these are enum constants. Every single object is public, static and final. Since it's final, we cannot
        // create child enum. Type is week
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        Week() {
            System.out.println("Constructor called for " + this);
        }
        // this is neither public nor protected, only private or default. Because we don't want to create new objects.
        // Internally: public static final Week Monday = new Week();
        @Override
        public void hello() {
            System.out.println("Hey, how are you?");
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();
        System.out.println(Week.valueOf("Tuesday"));
//        System.out.println(week);
//        System.out.println(week.ordinal()); // ordinal is position
//
//        for (Week day: Week.values()) {
//            System.out.println(day);
//        }
    }
}
