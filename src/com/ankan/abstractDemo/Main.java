package com.ankan.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(21);
        son.career();
        son.partner();

        Daughter daughter = new Daughter(20);
        daughter.career();
        daughter.partner();

        Parent mom = new Parent(39) {
            @Override
            void career() {

            }

            @Override
            void partner() {

            }
        }; // we can't create object of an abstract class.
        Parent.hello();
        son.normal();
    }
}
