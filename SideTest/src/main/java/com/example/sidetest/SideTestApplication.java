package com.example.sidetest;

import com.example.sidetest.Helpers.CharacterDBReader;
import com.example.sidetest.Models.BBCharacter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SideTestApplication {

    public static void main(String[] args) {
        CharacterDBReader characterDBReader = new CharacterDBReader();
        List<BBCharacter> characters = characterDBReader.parseDBLines();
        for(BBCharacter character : characters) {
            System.out.println(character.CharacterId);
            System.out.println(character.CharacterName);
            System.out.println(character.Gender);
        }
    }
}
