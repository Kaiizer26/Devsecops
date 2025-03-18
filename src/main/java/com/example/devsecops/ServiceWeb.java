package com.example.devsecops;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ServiceWeb {
    @GetMapping("/bonjour")
    public Car Bonjour(){
        Car car = new Car("AA11BB", "Maserati", 2000);
        return car;
    }
}
