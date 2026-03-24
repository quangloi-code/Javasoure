package org.example.overriding;

public class Parent {
    private String name;
    private int age;

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void work() {
        System.out.println("Parent is working from 4PM to 12PM. ");
    }
}
