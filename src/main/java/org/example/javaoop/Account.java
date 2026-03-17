package org.example.javaoop;

public class Account {
    public String accountName;
    public double balance;

    public Account(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Ten tai khoan: " + accountName);
        System.out.println("So tien: " + balance);

    }

    public void napTien(double soTienNap) {
        double soTienSauKhiNap = this.balance + soTienNap;
        System.out.println("So tien sau khi nap của tai khoan " + accountName + " là: " + soTienSauKhiNap);
    }
}
