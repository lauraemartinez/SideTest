package com.example.sidetest.Models;

import java.util.List;

public class BBCharacter {
    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getGender() {
        return Gender;
    }

    public String getHair() {
        return Hair;
    }

    public String getImage() {
        return Image;
    }

    public String getAge() {
        return Age;
    }

    public String[] getAllOccupations() {
        return AllOccupations;
    }

    public String getOccupation() {
        return Occupation;
    }

    public String[] getNicknames() {
        return Nicknames;
    }

    public Relative[] getRelatives() {
        return Relatives;
    }

    public String getFirstEpisode() {
        return FirstEpisode;
    }

    public String getVoicedBy() {
        return VoicedBy;
    }

    public String getWikiUrl() {
        return WikiUrl;
    }

    public int Id;
    public String Name;
    public String Gender;
    public String Image;
    public String Hair;
    public String Age;
    public String[] AllOccupations;
    public String Occupation;
    public String[] Nicknames;
    public Relative[] Relatives;
    public String FirstEpisode;
    public String VoicedBy;
    public String WikiUrl;

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setImage(String image) {
        Image = image;
    }

    public void setHair(String hair) {
        Hair = hair;
    }

    public void setAge(String age) {
        Age = age;
    }

    public void setAllOccupations(String[] allOccupations) {
        AllOccupations = allOccupations;
    }

    public void setOccupation(String occupation) {
        Occupation = occupation;
    }

    public void setNicknames(String[] nicknames) {
        Nicknames = nicknames;
    }

    public void setRelatives(Relative[] relatives) {
        Relatives = relatives;
    }

    public void setFirstEpisode(String firstEpisode) {
        FirstEpisode = firstEpisode;
    }

    public void setVoicedBy(String voicedBy) {
        VoicedBy = voicedBy;
    }

    public void setWikiUrl(String wikiUrl) {
        WikiUrl = wikiUrl;
    }


}
