package com.qa;

public class Car extends Vehicle{

    private int numDoors;
    private int cc;

    public Car(String make, int year, String colour, int numDoors, int cc) {
        super(make, year, colour);
        this.numDoors = numDoors;
        this.cc = cc;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numDoors);
        System.out.println("CC: " + cc);
    }

    public void start() {
        System.out.println("Car started!");
    }
}
