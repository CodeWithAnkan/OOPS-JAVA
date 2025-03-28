package com.ankan.stringBuffer;

import java.util.Random;

public class RandomString {
    static String generate(int size) {
        StringBuffer sb = new StringBuffer(size);

        Random rand = new Random();

        for (int i = 0; i < size ; i++) {
            int randomChar = 97 + (int) (rand.nextFloat() * 26);
            sb.append((char)randomChar);
        }
        return sb.toString();
    }
}
