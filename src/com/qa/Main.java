package com.qa;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



        Car skoda1 = new Car("Skoda", 2010, "Brown", 5, 2000);
        Car bmw1 = new Car("BMW", 2016, "White", 3, 2800);
        Car skoda2 = new Car("Skoda", 2019, "Blue", 5, 1200);
        Car skoda3 = new Car("Skoda", 2003, "Black", 5, 1800);

        Garage garage = new Garage();
        garage.addVehicle(skoda1);
        garage.addVehicle(bmw1);
        garage.addVehicle(skoda2);
        garage.addVehicle(skoda3);

        garage.printVehicleBills();

        garage.removeVehiclesByMake("Skoda");

        garage.printVehicleBills();

    }

}

