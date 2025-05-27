package com.example.sidetest.Helpers;

import com.example.sidetest.Models.BBCharacter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CharacterDBReader {
    public static List<List<String>> parseDBLines() {
        String characterPath = "src/main/java/TestDB/CharacterDB.csv";

        List<List<String>> data = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader( new FileReader(characterPath))){
            String fileLines;

            while ((fileLines = reader.readLine()) != null) {
                String[] line = fileLines.split(",");
                data.add(List.of(line));
            }

        } catch (Exception e) {

        }
        return data;
    }

    public static List<BBCharacter> loopOverLines(List<List<String>> dbLines){
        List<BBCharacter> characters = new ArrayList<>();

        for(int i = 1; i < dbLines.size(); i++){
            BBCharacter character = populateModel(dbLines.get(i));
            characters.add(character);
        }
        return characters;
    }

    public static BBCharacter populateModel(List<String> line){
        BBCharacter character = new BBCharacter();
        character.Id = Integer.parseInt(line.get(0));
        character.Name = line.get(1);
        character.Gender = line.get(2);

        return character;
    }

    public static List<BBCharacter> dbRead(){
        List<List<String>> dbLines = parseDBLines();
        List<BBCharacter> characters = loopOverLines(dbLines);

        return characters;
    }
}
