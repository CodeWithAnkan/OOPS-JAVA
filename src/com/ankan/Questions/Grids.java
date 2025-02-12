package com.ankan.Questions;

import java.util.Arrays;

public class Grids {
    public static void main(String[] args) {
        int [] [] ia2;
        int [] ia1 = {1, 2, 3};
        Object o = ia1;
        ia2 = new int[3][3];
        ia2 [0] = (int[]) o;
//        ia2 [0][0] = (int[]) o;
        ia2 [0][0] = ((int[]) o)[0];
    }
}

/*
* Here ia2[0] is the 1st row of 1D array in a 2D array which is assigned to the entire array of Object type o which
* is casted into (int[]) o. But in the case ia2[0][0] which defines the first element of the 2D array of int type, it
*  can't be assigned an entire 1D array. So, it gives a compilation error. To access and copy the first element of
* the 1D array we need to again cast to ((int[]) o)[0].
* */