package com.example.sidetest.Models;

public class BBCharacter {
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

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public int Id;
    public String Name;
    public String Gender;
    public String Image;

    public BBCharacter(int id, String name, String gender) {
        Id = id;
        Name = name;
        Gender = gender;
    }

    public BBCharacter() {}
}
