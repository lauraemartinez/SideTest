package com.example.sidetest.BobsBurgersApiClient;


import com.example.sidetest.Models.BBCharacter;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

public class BBApiClient {
    WebClient webClient = WebClient.create("https://bobsburgers-api.herokuapp.com");

    public BBCharacter getBBCharacter(int id) {
        Mono<ResponseEntity<BBCharacter>> result = webClient.get()
                .uri("/characters/{id}", id).accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .toEntity(BBCharacter.class);
        BBCharacter character = result.block().getBody();
        return character;
    }
}
