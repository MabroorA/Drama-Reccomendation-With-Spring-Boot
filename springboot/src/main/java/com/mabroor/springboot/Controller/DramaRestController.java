package com.mabroor.springboot.Controller;

import com.mabroor.springboot.Service.DramaService;
import com.mabroor.springboot.domain.Actor;
import com.mabroor.springboot.domain.Drama;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("")
@CrossOrigin("*")
public class DramaRestController {

    @Autowired
    DramaService dramaService;

    @GetMapping("/")
    public String Greeting(){
        return ("hii");
    }
    @GetMapping("/shows")
    public Flux<Drama> FindAllShows(){
        return this.dramaService.GetShows();
    }

    @GetMapping("/search/shows")
    public Flux<Drama> FindAllShowsByName(@RequestParam String q){
        return this.dramaService.GetShowsByRelevancey(q);
    }
    @GetMapping("/singlesearch/shows")
    public Mono<Drama> FindSingleShowByName(@RequestParam String q) {
        return  this.dramaService.GetShowByName(q);
    }

    @GetMapping("/lookup/shows")
    public Mono<Drama> FindSingleShowByID(@RequestParam("tvrage") String tvrage) {
        return  this.dramaService.GetShowByID(tvrage);
    }

    @GetMapping("/search/Actor")
    public Flux<Actor> FindActorByName(@RequestParam String q){
        return this.dramaService.GetActorByName(q);
    }


}


