package org.example;

import org.example.encapsulation.Employee;
import org.example.javaoop.Order;

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

/*
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

        Employee emp1 = new Employee("Lợi", 20,"SV",20000);
        Employee emp2 = new Employee("Bo", 18,"GV",12000000);
        emp1.showInfo();
        emp2.showInfo();

        //Tăng lương.
        emp1.raiseSalary(0.15);
        emp2.raiseSalary(0.15);




    }
}

