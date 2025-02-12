package com.ankan.Questions;

class Supercool {
    static String os = " ";
    void doStuff () {
        os += "super ";
        System.out.println(os);
    }
}

public class Cool extends Supercool {
    public static void main(String[] args) {
        new Cool().go();
    }
    void go() {
        Supercool s = new Cool();
        Cool c = (Cool) s;
        c.doStuff();
        s.doStuff();
        this.doStuff();
        super.doStuff();

        /*
        c.super.doStuff(), s.super.doStuff(), this.super.doStuff(), all are syntactically invalid. Object cannot use
        the super keyword but class can. So instead of c.super.doStuff(), Cool.super.doStuff() will be valid.
         */
    }
    void doStuff() {
        os += "cool ";
        System.out.println(os);
    }
}
