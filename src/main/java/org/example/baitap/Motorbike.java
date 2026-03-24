package org.example.baitap;

public class Motorbike extends Vehicle {
    public Motorbike(String brand) {
        super(brand);
    }
    @Override
    public void start() {
        System.out.println("Motorbike " + super.getBrand() + " is kick-start.");

}

}
