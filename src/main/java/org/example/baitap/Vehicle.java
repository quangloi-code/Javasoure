package org.example.baitap;

public class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void start() {
        System.out.println("Vehicle is starting.");

    }
}
