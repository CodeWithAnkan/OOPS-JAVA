package com.ankan.Questions;

public class Weed {
    protected static String s = "";
//    final void grow(){
//        s += "grow ";
//    } // omit final to override

    void grow(){
        s += "grow ";
    }

    static void growFast() {
        s += "fast ";
    }
}