package com.example.sidetest.Models;

public class Burger {
    public int Id;
    public String Name;
    public double price;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Burger(int id, String name, double price) {
        Id = id;
        Name = name;
        this.price = price;
    }
    public Burger() {};
}
