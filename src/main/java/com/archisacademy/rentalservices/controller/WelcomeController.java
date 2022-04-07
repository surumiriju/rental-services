package com.archisacademy.rentalservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping(value="/welcome")
    public String welcometotraining(){
        return "Hello from Archis";

    }
}
