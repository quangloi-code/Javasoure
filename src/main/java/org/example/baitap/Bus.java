package org.example.baitap;

public class Bus extends Vehicle {
    public Bus(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Bus " + super.getBrand() + " is starting with key.");

    }
}