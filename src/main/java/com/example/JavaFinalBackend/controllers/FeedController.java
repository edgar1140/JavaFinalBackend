package com.example.JavaFinalBackend.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedController {
    @CrossOrigin()
    @PostMapping("/feed/{username}")
    public Suscriber login(@PathVariable String username){
        return SuscriberRepostiory.byUsername(username);
    }
}
