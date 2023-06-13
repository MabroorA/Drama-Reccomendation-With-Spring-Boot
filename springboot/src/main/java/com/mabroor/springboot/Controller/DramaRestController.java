package com.mabroor.springboot.Controller;

import com.mabroor.springboot.domain.Drama;
import com.mabroor.springboot.repo.DramaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("")
public class DramaRestController {

    DramaRepository Drama_repo;
    private final WebClient webClient;

    public DramaRestController(WebClient.Builder builder ) {
        webClient = builder.baseUrl("https://api.tvmaze.com").build();
    }
    //    public Drama[] getdrama(){
//        return webClient
//                .get()
//                .uri("/shows")
//                .retrieve()
//                .bodyToMono(Drama[].class).
//                block();
//
//    }
    @GetMapping("/shows")
    public Drama[] GetShows(){
        return webClient
                .get()
                .uri("/shows")
                .retrieve()
                .bodyToMono(Drama[].class).
                block();
    }

    @GetMapping("/")
    public String Greeting(){
        return ("hii");
    }


    }


