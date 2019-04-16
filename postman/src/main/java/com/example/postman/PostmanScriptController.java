package com.example.postman;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
class PostmanScriptController {


    @PostMapping(path = "/postmanCollection")
    public Mono<PostmanCollection> generatePostmanCollection(@RequestBody UserStory userStory) {

        PostmanCollection result = new PostmanCollection();

        result.set

        return Mono.just(new PostmanCollection());

    }


}
