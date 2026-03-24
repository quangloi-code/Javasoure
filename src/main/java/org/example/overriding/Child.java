package org.example.overriding;

public class Child extends Parent {

    public Child(String name, int age) {
        super(name, age);
    }
    @Override
    public void work() {
        System.out.println("Child is working from 1PM to 5PM. ");
    }
}
