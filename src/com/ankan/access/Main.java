package com.ankan.access;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "Ankan"); // when a variale is private we cannot access it through an object variable but
        // can use it in the object
        // things to do
        // 1. Access the data members
        // 2. modify the data members

        obj.getNum();
        int n = obj.num;

        ArrayList<Integer> array = new ArrayList<>(23);
        // array.DEFAULT_CAPACITY --> Can't access it because it is private
    }
}
