package com.ankan.stringBuffer;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.random.*;

import static com.ankan.stringBuffer.RandomString.generate;

public class LargeStringExample {
    public static void main(String[] args) {

        // constructor 1
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        //constructor 2
        StringBuffer sb2 = new StringBuffer("Ankan Chatterjee");

        //constructor 3
        StringBuffer sb3 = new StringBuffer(30);
        System.out.println(sb3.capacity());

        sb.append("WeMakeDevs");
        sb.append(" is nice");
//        sb.insert(2, " Ankan ");
        sb.replace(1, 5, " Chatterjee "); // end integer is not inclusive
        sb.delete(1, 5); // end integer is not inclusive

        String str = sb.toString();
        System.out.println(str);

        /* What is StringBuffer class?
            Mutable sequence of characters
            Advantages over String
            --> Mutable
            --> More Efficient because we don't have to make objects again and again
            --> Thread safe
            ** String Builder is not thread-safe but it is faster
         */
        int n = 20;
        String name = generate(n);
        System.out.println(name);

        // removing whitespaces

        String sentence = "Hi   my  name is    Ankan";
        System.out.println(sentence);
        System.out.println(sentence.replaceAll("\\s", ""));

        // split

        String arr = "Ankan, Apoorv, Rahul, Snehal";
        String[] names = arr.split(", ");
        System.out.println(Arrays.toString(names));

        // rounding off
        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println(df.format(7.29));
    }
}