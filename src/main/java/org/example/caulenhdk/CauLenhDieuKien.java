package org.example.caulenhdk;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CauLenhDieuKien{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri cua ngay: ");
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Thu 2");
            case 2 -> System.out.println("Thu 3");
            case 3 -> System.out.println("Thu 4");
            case 4 -> System.out.println("Thu 5");
            case 5 -> System.out.println("Thu 6");
            case 6 -> System.out.println("Thu 7");
            case 7 -> System.out.println("Chu nhat");
            case 8 -> System.out.println("Ngay khong hop le");
        }

        System.out.println("Nhap diem: ");
        double grade = sc.nextDouble();
        if ( grade > 9 && grade <= 10 ) {
            System.out.println("Hoc luc xuat sac ");
        } else if ( grade > 8 && grade <= 9){
            System.out.println("Hoc luc gioi");
        } else if ( grade > 6.5 && grade <= 8){
            System.out.println("Hoc luc kha");
        } else if ( grade > 5 && grade <= 6.5){
            System.out.println("Hoc luc trung binh");
        } else if ( grade >= 0 && grade <= 5){
            System.out.println("Hoc luc yeu");
        } else System.out.println("Khong hop le");


    }
}
