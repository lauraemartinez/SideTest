package com.example.sidetest;

import com.example.sidetest.BobsBurgersApiClient.BBApiClient;
import com.example.sidetest.Models.BBCharacter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SideTestApplication {

    private static final Logger log = LoggerFactory.getLogger(SideTestApplication.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BBApiClient bbApiClient = new BBApiClient();

        System.out.println("Input the id of the character you want");
        int id = Integer.parseInt(scanner.nextLine());
        BBCharacter character = bbApiClient.getBBCharacter(id);
        System.out.println(character.getId());
        System.out.println(character.getName());
        System.out.println(character.getGender());
        System.out.println(character.getImage());
//        List<BBCharacter> characters = CharacterDBReader.dbRead();
//
//        for(BBCharacter character : characters) {
//            System.out.println(character.CharacterId);
//            System.out.println(character.CharacterName);
//            System.out.println(character.Gender);
//        }
        //SpringApplication.run(SideTestApplication.class, args);
    }

//    @Bean
//    public RestTemplate restTemplate(RestTemplateBuilder builder){
//        return builder.build();
//    }
//
//    @Bean
//    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//        return args -> {
//            BBCharacter character = restTemplate.getForObject(
//                    "https://bobsburgers-api.herokuapp.com/characters/", BBCharacter.class);
//            log.info(character.toString());
//        };
//    }
}
