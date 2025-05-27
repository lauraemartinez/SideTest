package com.example.sidetest.Controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {
    @GetMapping("/characters")
    public String getAllCharacters(){

        return "";
    }
}
