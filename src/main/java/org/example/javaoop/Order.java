package org.example.javaoop;

public class Order {
    private String id;
    private  String name;
    private double price;
    private int quanity;

    public Order(String id, String name,double price, int quanity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quanity = quanity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }
    public void display() {
        System.out.println("Order ID: " + getId());
        System.out.println("Order Name: " + getName());
        System.out.println("Order Price: " + getPrice());
        System.out.println("Order Quanity: " + getQuanity());

    }

    public void update(int newQuanity) {
        setQuanity(newQuanity);
    }
}
