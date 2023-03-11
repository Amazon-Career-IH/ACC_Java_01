package com.ironhack.vehicles;

import com.ironhack.vehicles.*;

public class Truck extends Car {
    private double towingCapacity;
    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }
    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
    public double getTowingCapacity() {
        return towingCapacity;
    }
    @Override
    public String getInfo() {
        return "Marca: " + getMake() + "\n"
                + "Modelo: " + getModel() + "\n"
                + "Kilometraje: " + getMileage() + "\n"
                + "VIN: " + getVinNumber() + "\n"
                + "Capacidad de remolque: " + getTowingCapacity();
    }
}
