package com.ironhack;

public class MathLibrary {



    public static int sum(int x, int y) {

        int result = x + y;
        // 2 + 4 = 6
        // 2 != 6 -4

        if (x != result - y) {
            System.out.println("La suma no se ha hecho correctamente");
        }

        return  x + y;
    }

    public static int multiply(int x, int y) {
        int product = x * y;

        if (product / x != y) {
            throw new ArithmeticException("Los números son demasiado grandes para un int");
        }

        return product;

    }


    public static long multiply(long x, long y) {
        return x * y;
    }

    public static int[] sumTenToArray(int[] arrray) {
        for (int i = 0; i < arrray.length; i++) {
            arrray[i] += 10;

        }
        return arrray;
    }
}
