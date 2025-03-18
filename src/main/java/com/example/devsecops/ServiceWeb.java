package com.example.devsecops;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ServiceWeb {
    @GetMapping("/bonjour")
    public String Bonjour(){
        return "Bonjour !";
    }
}
