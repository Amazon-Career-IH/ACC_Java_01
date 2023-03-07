package com.ironhack;

public class MathLibrary {

    public static int sum(int x, int y) {
        return  x + y;
    }
    public static int[] sumTenToArray(int[] arrray) {
        for (int i = 0; i < arrray.length; i++) {
            arrray[i] += 10;

        }
        return arrray;
    }
}
