package org.example.astraction;

public class Dog extends Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }
    public Dog() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog " + this.name + " says: GAU GAU GAU GAU!");
    }
}
