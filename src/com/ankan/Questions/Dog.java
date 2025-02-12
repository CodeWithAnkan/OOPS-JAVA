package com.ankan.Questions;

public class Dog {
    void makeNoise() {
        System.out.println("Bark ");
    }

    static void play() {
        System.out.println("catching ");
    }
}
    class Bloodhound extends Dog {
        void makeNoise() {
            System.out.println("howl ");
        }

        public static void main(String[] args) {
            Dog tom = new Bloodhound();
            new Bloodhound().go();
//            super.play();
//            super.makeNoise();

            Dog.play();
            tom.makeNoise();
        }
        void go() {
            super.play();
            makeNoise();
            super.makeNoise();
        }
    }