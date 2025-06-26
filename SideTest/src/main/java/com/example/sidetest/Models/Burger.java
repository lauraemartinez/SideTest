package com.example.sidetest.Models;

public class Burger {
    public int Id;
    public String Name;
    public String price;

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Burger(int id, String name, String price) {
        Id = id;
        Name = name;
        this.price = price;
    }
    public Burger() {}
}
