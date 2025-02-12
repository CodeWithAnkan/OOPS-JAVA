package com.ankan.Questions;

public class OffRamp {
    public static void main(String[] args) {
        int[] exits = {0, 0, 0, 0, 0, 0};
        int x1 = 0;

        for (int x = 0; x < 4; x++) {
            exits[0] = x;
        }
        for (int x = 0; x < 4; x++) {
            exits[1] = x;
        }

        x1 = 0;
        while(x1++ < 3) exits[2] = x1;
        x1 = 0;
        while(++x1 < 3) exits[3] = x1;

        x1 = 0;
        do {
            exits[4] = x1;
        } while (x1++ < 7);
        x1 = 0;
        do {
            exits[5] = x1;
        } while (++x1 < 7);

        for(int x: exits) {System.out.print(x + " ");}
    }
}
