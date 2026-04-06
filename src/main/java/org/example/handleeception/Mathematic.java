package org.example.handleeception;

import org.example.exception.CustemException;

public class Mathematic {
    public static void calculateDivide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Ko the chia mot so cho 0, mau so phai khac 0");
        }
        System.out.println("Ket qua: " + a / b);
    }
    public static void checkScore(int score) {
        if (score < 0 || score >10) {
            throw new CustemException("Diem khong hop le, diem phai tu 0-10");
        }
        System.out.println("Diem cua ban la: " + score);
    }
}
