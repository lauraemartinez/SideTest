package com.example.sidetest.Helpers;

import com.example.sidetest.Models.BBCharacter;

import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharacterDBReader {
    public List<BBCharacter> parseDBLines() {
        try {
            Path characterPath = Paths.get("src/main/java/TestDB/CharacterDB.csv");

            BufferedReader reader = Files.newBufferedReader(characterPath, StandardCharsets.UTF_8);

            List<BBCharacter> characters = new ArrayList<>();


            while ((reader.readLine()) != null) {
                String[] line = reader.readLine().split(",");
                BBCharacter character = new BBCharacter();
                character.CharacterId = Integer.parseInt(line[0]);
                character.CharacterName = line[1];
                character.Gender = line[2];
                characters.add(character);

            }
            reader.close();
            return characters;
        } catch (Exception e) {

        }
        return null;
    }
}
