package com.example.sidetest.Models;

public class Burger {
    public int Id;
    public String Name;
    public String Price;
    public String Season;
    public String Episode;
    public String EpisodeUrl;
    public String Url;

    public String getSeason() {
        return Season;
    }

    public void setSeason(String season) {
        Season = season;
    }

    public String getEpisode() {
        return Episode;
    }

    public void setEpisode(String episode) {
        Episode = episode;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getEpisodeUrl() {
        return EpisodeUrl;
    }

    public void setEpisodeUrl(String episodeUrl) {
        EpisodeUrl = episodeUrl;
    }

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
        return Price;
    }

    public void setPrice(String price) {
        this.Price = price;
    }

}
