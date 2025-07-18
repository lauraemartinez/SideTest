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
        StringBuilder titleCase = new StringBuilder(Name.length());
        boolean nextTitleCase = true;
        for(char c : Name.toCharArray()){
            if(Character.isSpaceChar(c)){
                nextTitleCase = true;
            }
            else if (nextTitleCase){
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }
            titleCase.append(c);
        }

        return titleCase.toString();
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
