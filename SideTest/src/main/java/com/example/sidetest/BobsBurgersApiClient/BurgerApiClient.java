package com.example.sidetest.BobsBurgersApiClient;

import com.example.sidetest.Models.Burger;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import java.util.List;
import java.util.Objects;

public class BurgerApiClient {
    WebClient webClient = WebClient.builder().baseUrl("https://bobsburgers-api.herokuapp.com")
            .codecs(configurer -> configurer.defaultCodecs().maxInMemorySize(2 * 1024 * 1024))
            .build();

    public Burger getBurger(int id) {
        Mono<ResponseEntity<Burger>> result = webClient.get()
                .uri("/burgerOfTheDay/{id}", id).accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .toEntity(Burger.class);
        return Objects.requireNonNull(result.block()).getBody();
    }

    public List<Burger> getAllBurgers() {
        Mono<List<Burger>> result = webClient.get()
                .uri("/burgerOfTheDay/").accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Burger>>() { });
        return Objects.requireNonNull(result.block()).stream().toList();
    }
}
