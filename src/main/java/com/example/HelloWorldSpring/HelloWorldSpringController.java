package com.example.HelloWorldSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldSpringController {
    @GetMapping("/hello")
    public Greeting hello(@RequestParam(value = "country", defaultValue = "japan") String country){
        Greeting greeting = new Greeting();
        greeting.setCountry(country);
        switch (country) {
            case "japan" -> greeting.setMessage("こんにちは!");
            case "us" -> greeting.setMessage("Hello!");
            case "france" -> greeting.setMessage("Bonjour!");
            case "korea" -> greeting.setMessage("안녕하세요!");
            default -> greeting.setMessage("こんにちは!");
        }
        return greeting;
    }
}
