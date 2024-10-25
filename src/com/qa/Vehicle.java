package com.qa;

public abstract class Vehicle {

    private String make;
    private int year;
    private String colour;

    public Vehicle(String make, int year, String colour) {
        this.make = make;
        this.year = year;
        this.colour = colour;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Year: " + year);
        System.out.println("Colour: "+ colour);
    }
}
