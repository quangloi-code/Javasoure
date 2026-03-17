package org.example.javaoop;

public class HinhChuNhat {
    public double chieuDai;
    public double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public void display() {
        System.out.println("Chieu dai là: " + this.chieuDai);
        System.out.println("Chieu rong là: " + this.chieuRong);

    }

    public void dienTich() {
        double dienTich = this.chieuDai * this.chieuRong;
        System.out.println("Dien tich hinh chu nhat là: " + dienTich);
    }
}
