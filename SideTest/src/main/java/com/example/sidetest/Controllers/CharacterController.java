package com.example.sidetest.Controllers;
import com.example.sidetest.BobsBurgersApiClient.BBApiClient;
import com.example.sidetest.Models.BBCharacter;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:4200")
public class CharacterController {

    BBApiClient bbApiClient = new BBApiClient();

    @GetMapping("/characters")
    public List<BBCharacter> getAllCharacters(){
        return bbApiClient.getAllBBCharacters();
    }

    @GetMapping("/characters/{id}")
    public BBCharacter getCharacterById(@PathVariable String id){
        return bbApiClient.getBBCharacter(Integer.parseInt(id));
    }
}
