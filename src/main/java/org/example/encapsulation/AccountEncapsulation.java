package org.example.encapsulation;

public class AccountEncapsulation {
    private String accountName;
    private double balance;

//    public void setAccountName(String name) {
//        this.accountName = name;
//    }
//
//    public void setBalance(double balance1) {
//        this.balance = balance1;
//    }
//
//    public void getAccountName() {
//        System.out.println("Ten tai khoan: " + this.accountName);
//
//    }
//
//    public void getBalance() {
//        System.out.println("So tien: " + this.balance);
//    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
