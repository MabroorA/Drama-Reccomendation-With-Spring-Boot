package com.mabroor.springboot.Service;

import com.mabroor.springboot.domain.Drama;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
public class DramaService {

    private final WebClient webClient;

    public DramaService(WebClient.Builder builder ) {
        webClient = builder.baseUrl("https://api.tvmaze.com").build();
    }

    public Flux<Drama> GetShows(){
        return this.webClient
                .get()
                .uri("/shows")
                .retrieve()
                .bodyToFlux(Drama.class);
    }

    public  Flux<Drama> GetShowsByName(@RequestParam String name){
        return this.webClient
                .get()
                .uri("/singlesearch/shows?q={name}", name)
                .retrieve()
                .bodyToFlux(Drama.class);
    }
    
}
