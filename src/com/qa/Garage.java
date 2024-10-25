package com.qa;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public class Garage {

    private final List<Vehicle> garageList = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        garageList.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        garageList.remove(vehicle);
    }

    public void removeVehiclesByMake(String make) {
        garageList.removeIf(vehicle -> vehicle.getMake().equalsIgnoreCase(make));
    }

    private float generateBill(Vehicle vehicle) {
        float billCalc = (float) Math.round(100 * (35 + 30 * Math.random()));
        return (abs(2025 - vehicle.getYear()) * billCalc / 100);
    }

    public void printVehicles() {
        System.out.println("Vehicles in the garage: \n===========");
        for (Vehicle vehicle:garageList) {
            vehicle.displayInfo();
            System.out.println("===========");
        }
    }

    public void printVehicleBills() {
        System.out.println("Vehicle bills: \n===========");
        for (Vehicle vehicle:garageList) {
            System.out.println("Vehicle: " + vehicle.getYear() + " " + vehicle.getMake() + "\nBill: £" + generateBill(vehicle));
            System.out.println("===========");

    }
}}
