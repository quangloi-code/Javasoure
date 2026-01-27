package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //Bài 8: Viết chương trình Java nhập vào hai số thực a và b. So sánh hai số: số lớn hơn, số nhỏ hơn, kiểm tra hai số có bằng nhau hay không?
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap gia tri b: ");
        double b = sc.nextDouble();
        //Cong thuc
        double soLonHon = Math.max(a,b);
        double soNhoHon = Math.min(a,b);
        boolean check = (a==b);
        // In ra ket qua
        System.out.println("So lon nhat la: " + soLonHon);
        System.out.println("So nho nhat la: " + soNhoHon);
        System.out.println("Gia tri cua check la: " + check);

        System.out.println("Hello thu 3 ");




    }
    }

