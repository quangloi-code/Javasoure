package org.example.inheritance;

public class Employee1 extends Person {

    private int salary;

    public Employee1(String name, int age) {
        super(name, age);
    }
    public Employee1(String name, int age, int salary1) {
        super (name,age);
        this.salary = salary1;

    }
    public void displayInfor() {
        System.out.println("Tên: " + this.getName());
        System.out.println("Tuổi: " + this.getAge());
        System.out.println("Salary: " + this.salary);
    }
}
