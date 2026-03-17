package org.example.encapsulation;

public class Employee {
    private String name;
    private int age;
    private String department;
    private double salary;
    private String company;

    public Employee(String name, int age, String department, double salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary =salary;
        this.company = null;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    public void showInfo() {
        System.out.println("Tên: " + this.name);
        System.out.println("Tuổi: " + this.age);
        System.out.println("Department: " + this.department);
        System.out.println("Salary: " + this.salary);
        System.out.println("Company:  " + null);
    }
    public void raiseSalary(double amount) {
        if (amount > 0) {
            salary = salary * 1.15;
            System.out.println("Lương đã tăng là: " + salary);
        } else {
            System.out.println("Không hợp lệ để tăng.");
        }
    }
}

