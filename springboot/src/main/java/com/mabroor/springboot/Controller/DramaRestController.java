package com.mabroor.springboot.Controller;

import com.mabroor.springboot.Service.DramaService;
import com.mabroor.springboot.domain.Drama;
import com.mabroor.springboot.repo.DramaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("")
public class DramaRestController {

//    private final WebClient webClient;
//
//    public DramaRestController(WebClient.Builder builder ) {
//        webClient = builder.baseUrl("https://api.tvmaze.com").build();
//    }
    //    public Drama[] getdrama(){
//        return webClient
//                .get()
//                .uri("/shows")
//                .retrieve()
//                .bodyToMono(Drama[].class).
//                block();
//
//    }

    @Autowired
    DramaService dramaService;
    @GetMapping("/shows")
    public Flux<Drama> FindAllShows(){
        return this.dramaService.GetShows();
    }

    @GetMapping("/search/shows")
    public Flux<Drama> FindAllShowsByName(@RequestParam String q){
        return this.dramaService.GetShowsByName(q);
    }

    @GetMapping("/")
    public String Greeting(){
        return ("hii");
    }


    }


