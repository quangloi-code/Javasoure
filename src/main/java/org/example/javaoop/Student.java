package org.example.javaoop;

//class dùng để lưu thông tin của học sinh
//Class sẽ được thể hiện bởi hai thứ:
/*
- Dau tien: tên, tuổi, điểm số
- thứ hai: hành vi (phuong thuc): dnag hoc bai

 */
public class Student {
    // Thuoc tinh:
    public String name;
    public int age;
    public double gpa;

    // Hàm tạo JAVA-tên của hàm tạo trùng với tên của class
    public Student(String name, int age, double gpa) {
        //Hàm tạo là hàm tạo giá trị
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
        public void display(){
            System.out.println("Ten: " + this.name);
            System.out.println("Tuoi: " + this.age);
            System.out.println("Diem GPA: " + this.gpa);


    }
/*
    // Hành vi (phuong thúc):
    public void  study() {
        System.out.println("Dang hoc bai");
    }

    // Hanh vi dang di choi da bong
    public void playSoccer(String name) {
        System.out.println(name + " dang nghi ngoi ");
*/
    }

