package com.example.sidetest.BobsBurgersApiClient;

import com.example.sidetest.Models.Burger;
import com.example.sidetest.Models.Burger;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

public class BurgerApiClient {
    WebClient webClient = WebClient.create("https://bobsburgers-api.herokuapp.com");

    public Burger getBurger(int id) {
        Mono<ResponseEntity<Burger>> result = webClient.get()
                .uri("/burgerOfTheDay/{id}", id).accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .toEntity(Burger.class);
        Burger burger = result.block().getBody();
        return burger;
    }

    public List<Burger> getAllBurgers() {
        Mono<List<Burger>> result = webClient.get()
                .uri("/burgerOfTheDay/").accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Burger>>() { });
        List<Burger> burgers = result.block();
        return burgers;
    }
}
