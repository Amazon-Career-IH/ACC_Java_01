package com.ironhack;

import com.google.gson.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Hello world!");

        ArrayList<InvoiceItem> invoiceItems = new ArrayList<>();
        invoiceItems.add(new InvoiceItem("Coca Cola", 10));
        invoiceItems.add(new InvoiceItem("Rum Santa Teresa 0.7L", 15));

        Invoice invoice = new Invoice("ID-1010", 25, false, invoiceItems);

        Gson gson = new Gson();
        String json = gson.toJson(invoice);

        Invoice invoiceFromJSON = gson.fromJson(json, Invoice.class);

        System.out.println(invoiceFromJSON.getTotal());

        System.out.println(MathLibrary.sum(2, 4));

    }
}
