package com.ankan.Questions;

public class Dec26 {
    public static void main(String[] args) {
        short a1 = 6;
        new Dec26().go(a1);
        new Dec26().go(new Integer(7));
    }
    void go(Short x) {
        System.out.print("S ");
    }
    void go(Long x) {
        System.out.print("L ");
    }
    void go (int x) {
        System.out.print("i ");
    }
    void go (Number n) {
        System.out.print("N ");
    }
}

/*
Output is: i N because Java prefers primitive widening (byte -> short -> int -> long -> float -> double) than
autoboxing (int -> Integer)
 */