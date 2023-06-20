package com.mabroor.springboot.Controller;

import com.mabroor.springboot.Service.DramaService;
import com.mabroor.springboot.domain.Drama;
import com.mabroor.springboot.repo.DramaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("")
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

}


