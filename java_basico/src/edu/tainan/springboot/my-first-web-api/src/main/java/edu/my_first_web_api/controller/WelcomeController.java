package edu.my_first_web_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Responsável por designar o bean de compoment, que surporta requisições HTTP com base na arquitetura REST.
@RestController
public class WelcomeController {
    
    // Determina que o método aceitará requisições HTTP do tipo GET.
    @GetMapping
    public String welcome() {
        return "Hello Word, i'm use Spring Boot with API";
    }
}
