package com.demo.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private int qty;

    public Product(int id, String name, double price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return id + ". " + name + "\t- Rs" + price + " (Available: \t" + qty + ")";
    }
}
