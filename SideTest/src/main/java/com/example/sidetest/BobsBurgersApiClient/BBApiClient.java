package com.example.sidetest.BobsBurgersApiClient;

import com.example.sidetest.Models.BBCharacter;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import java.util.List;
import java.util.Objects;

public class BBApiClient {
    WebClient webClient = WebClient.builder().baseUrl("https://bobsburgers-api.herokuapp.com")
            .codecs(configurer -> configurer.defaultCodecs().maxInMemorySize(2 * 1024 * 1024))
            .build();

    public BBCharacter getBBCharacter(int id) {
        Mono<ResponseEntity<BBCharacter>> result = webClient.get()
                .uri("/characters/{id}", id).accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .toEntity(BBCharacter.class);
        return Objects.requireNonNull(result.block()).getBody();
    }

    public List<BBCharacter> getAllBBCharacters() {
        Mono<List<BBCharacter>> result = webClient.get()
                .uri("/characters/").accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<BBCharacter>>() { });
        return Objects.requireNonNull(result.block()).stream().toList();
    }
}
