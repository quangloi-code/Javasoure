package org.example;

import org.example.baitap.Bus;
import org.example.baitap.Car;
import org.example.baitap.Motorbike;
import org.example.baitap.Vehicle;
import org.example.encapsulation.Employee;
import org.example.inheritance.Employee1;
import org.example.javaoop.Order;
import org.example.overloading.SumCalculator;
import org.example.overriding.Child;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Tao sinh vien Kien
        /*buoi1
        System.out.println("Tao sinh vien Loi");
        Student svLoi = new Student();

        svLoi.name = "Quang Loi";
        svLoi.age = 20;
        svLoi.gpa = 9.0;

        System.out.println("Ten: " +svLoi.name);
        System.out.println("Tuoi: " + svLoi.age);
        System.out.println("Diem GPA: " + svLoi.gpa);

        //In ra hanh vi dang học bai cua sinh vien Kien
        svLoi.study();
        svLoi.playSoccer(svLoi.name);
*/
        /*buổi 2
        Student svLoi = new Student("Loi",20,9.0);
        svLoi.display();

        Student svKien = new Student("Kien",17,9.0);
        svKien.display();*/
        /*Account acct = new Account("AccountKien", 10000);
        acct.display();

        acct.napTien(20000);*/
/*
        HinhChuNhat hcn = new HinhChuNhat(2.4,3.6);
        hcn.display();

        hcn.dienTich();*/

//        AccountEncapsulation acct = new AccountEncapsulation();
//        acct.setAccountName("So dep account Kien. ");
//        acct.setBalance(20000);
//
//        acct.getBalance();
//
//        acct.getAccountName();

/*Bài tập
        Tao 1 class Order dung de luu thong tin cua 1 don hang
        * co các thuộc tỉnh: id, name, price, quantity (so luong)
        * Viet cac method getter / setter cho các thuộc tỉnh tren
        * Viet ham tao
        * Viet method hien thì thong tin của don hang
        * Viet method cap nhap so luong don hang
*/
//        Order order = new Order("Order001", "Don hang 1", 20000, 2);
//
//        System.out.println("Truoc khi update Quanity. ");
//        order.display();
//
//        System.out.println("Saau khi update Quanity. ");
//        order.update(10);
//        order.display();
//Bài tập ngày 17/3/2026
//        Employee emp1 = new Employee("Lợi", 20,"SV",20000);
//        Employee emp2 = new Employee("Bo", 18,"GV",12000000);
//        emp1.showInfo();
//        emp2.showInfo();
//
//        //Tăng lương.
//        emp1.raiseSalary(0.15);
//        emp2.raiseSalary(0.15);

//        Employee1 emp = new Employee1("Kiên", 20);
//        Employee1 emp1 = new Employee1("Kiên", 20, 10000);
//
//        emp.display();
//        emp1.displayInfor();

//22/3
//        Child child = new Child("Kien",18);
//        child.work();
//        SumCalculator sumca = new SumCalculator();
//
//        System.out.println("Tong hai so nguyên.");
//        sumca.display(4,5);
//
//        System.out.println("Tong ba so nguyên.");
//        sumca.display(10,11,13);
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car("VinFast");
        vehicles[1] = new Motorbike("Vision");
        vehicles[2] = new Bus("Xe buyt 81");

        for(Vehicle i : vehicles) {
            i.start();
        }

    }
}

