package org.example.overloading;

public class SumCalculator {
    public int sum(int a, int b) {
        return a + b;
    }
    public int sum(int a, int b, int c) {
        return a + b + c;
}
public void display(int a, int b) {
    System.out.println("Tong cac so dâ dươc tinh toan: " + sum(a,b));

   }
public void display(int a, int b, int c) {
    System.out.println("Tong cac so dâ dươc tinh toan: " + sum(a,b,c));

}
}
