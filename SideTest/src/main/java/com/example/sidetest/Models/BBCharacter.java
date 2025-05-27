package com.example.sidetest.Models;

public class BBCharacter {
    public int getCharacterId() {
        return CharacterId;
    }

    public void setCharacterId(int characterId) {
        CharacterId = characterId;
    }

    public String getCharacterName() {
        return CharacterName;
    }

    public void setCharacterName(String characterName) {
        CharacterName = characterName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getCharacterImage() {
        return CharacterImage;
    }

    public void setCharacterImage(String characterImage) {
        CharacterImage = characterImage;
    }

    public int CharacterId;
    public String CharacterName;
    public String Gender;
    public String CharacterImage;

    public BBCharacter(int characterId, String characterName, String gender) {
        CharacterId = characterId;
        CharacterName = characterName;
        Gender = gender;
    }

    public BBCharacter() {}
}
