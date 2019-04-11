package com.example.postman;

import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
class PostmanScriptController {




    public Mono<Collection> generatePostmanCollection(String description, String url, String acceptanceCriteria){

        return Mono.just(new Collection());

    }


}
