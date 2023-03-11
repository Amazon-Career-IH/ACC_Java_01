package com.ironhack.vehicles;

import com.ironhack.vehicles.*;

public class UtilityVehicle extends Car {
    private boolean fourWheelDrive;
    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }
    public boolean hasFourWheelDrive() {
        return fourWheelDrive;
    }
    @Override
    public String getInfo() {
        return "Marca: " + getMake() + "\n"
                + "Modelo: " + getModel() + "\n"
                + "Kilometraje: " + getMileage() + "\n"
                + "VIN: " + getVinNumber() + "\n"
                + "Tracción en las cuatro ruedas: " + hasFourWheelDrive();
    }
}
