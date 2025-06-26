package com.example.sidetest.Controllers;

import com.example.sidetest.BobsBurgersApiClient.BurgerApiClient;
import com.example.sidetest.Models.Burger;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:4200")
public class BurgerController {
    BurgerApiClient burgerApiClient = new BurgerApiClient();

    @GetMapping("/burgers")
    public List<Burger> getAllBurgers(){

        return burgerApiClient.getAllBurgers();
    }

    @GetMapping("/burgers/{id}")
    public Burger getBurgerById(@PathVariable String id){

        return burgerApiClient.getBurger(Integer.parseInt(id));
    }
}
