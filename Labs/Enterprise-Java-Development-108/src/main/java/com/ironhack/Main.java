package com.ironhack;

import com.ironhack.intList.*;
import com.ironhack.streaming.*;
import com.ironhack.vehicles.*;

import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("====Big Decimal====");
        BigDecimal num = new BigDecimal("8.52174");
        System.out.println(bigDecimalToDouble(num));
        System.out.println(invertAndRound(num));



        System.out.println("====Streaming Service====");
        Movie movie = new Movie("Lord of the Rings", 182, 9.2);
        TvSeries tvSeries = new TvSeries("Friends", 25, 140);

        System.out.println(movie.getInfo());
        System.out.println(tvSeries.getInfo());

        System.out.println("====Vehicles====");

        Truck truck = new Truck("AH21313", "Volvo", "SuperTruck", 1220, 2250);
        Sedan sedan = new Sedan("AU123123", "Audi", "A4", 20000);
        UtilityVehicle utilityVehicle = new UtilityVehicle("VC123123","Ford", "Fiesta", 10,  false);

        System.out.println(truck.getInfo());
        System.out.println(sedan.getInfo());
        System.out.println(utilityVehicle.getInfo());

        System.out.println("===IntList===");

        IntArrayList intArrayList = new IntArrayList();

        for (int i = 0; i < 11; i++) {
            intArrayList.add(i);
        }

        System.out.println(Arrays.toString(intArrayList.getNumbers()));


    }

    public static double bigDecimalToDouble(BigDecimal number) {
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static BigDecimal invertAndRound(BigDecimal number) {
        return number.setScale(1, RoundingMode.HALF_UP).negate();
    }

}
