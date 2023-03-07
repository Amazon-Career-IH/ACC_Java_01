package com.ironhack;

import com.google.gson.*;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)  {


        ArrayList<InvoiceItem> invoiceItems = new ArrayList<>();
        invoiceItems.add(new InvoiceItem("Coca Cola", 10));
        invoiceItems.add(new InvoiceItem("Rum Santa Teresa 0.7L", 15));

        Invoice invoice = new Invoice("ID-1010", 25, false, invoiceItems);
        Invoice invoice2 = new Invoice("ID-1010", 25, false, invoiceItems);

        System.out.println(invoice.hashCode());
        System.out.println(invoice2.hashCode());

        System.out.println(invoice.equals(invoice2));
        System.out.println(invoice);
        System.out.println(invoice2);

        String name = "Jaume";


        System.out.println("Hola".equals("Hola"));




        

        Gson gson = new Gson();
        String json = gson.toJson(invoice);

        Invoice invoiceFromJSON = gson.fromJson(json, Invoice.class);

        System.out.println(invoiceFromJSON.getTotal());

        System.out.println(MathLibrary.sum(2, 4));

        System.out.println(Integer.MAX_VALUE);

        try {
            System.out.println(MathLibrary.multiply(Integer.MAX_VALUE, Integer.MAX_VALUE));
        } catch (ArithmeticException e) {
            System.err.println("Número demasiado grandes para enteros");
            System.out.println(MathLibrary.multiply((long)Integer.MAX_VALUE, (long) Integer.MAX_VALUE));
        }

        try {
        FileReader reader = new FileReader("archivo.txt");

        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        }

        String name = null;

        try {
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("No se ha podido leer el tamaño porque name es nulo");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu edad");

        int age = -1;

        while (age < 0) {
        try {
             age = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Pásame números!!");
             input.nextLine();
            }
        }


    }
}
