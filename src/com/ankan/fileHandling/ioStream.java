package com.ankan.fileHandling;

import java.io.IOException;
import java.io.InputStreamReader;

public class ioStream {
    public static void main(String[] args) {
        try (InputStreamReader isr = new InputStreamReader(System.in)) {
            System.out.print("Enter some numbers: ");
            int num = isr.read();
            while(isr.ready()) {
                System.out.println((char) num);
                num = isr.read();
            }
            isr.close();
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}