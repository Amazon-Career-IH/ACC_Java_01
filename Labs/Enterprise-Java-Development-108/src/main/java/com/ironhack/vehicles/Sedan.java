package com.ironhack.vehicles;

import com.ironhack.vehicles.*;

public class Sedan extends Car {
    public Sedan(String vinNumber, String make, String model, int mileage) {
        super(vinNumber, make, model, mileage);
    }
    @Override
    public String getInfo() {
        return "Marca: " + getMake() + "\n"
                + "Modelo: " + getModel() + "\n"
                + "Kilometraje: " + getMileage() + "\n"
                + "VIN: " + getVinNumber();
    }
}
