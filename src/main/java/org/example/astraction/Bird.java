package org.example.astraction;

public class Bird implements AnimalAction {
    private String name;

    public Bird() {}

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void fly() {
        System.out.println("Bird " + this.name + " can fly!");
    }

}
