package com.example.HelloWorldSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldSpringController {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "country", defaultValue = " ") String country){
        return switch (country) {
            case "japan" -> country + "：こんにちは!";
            case "us" -> country + "：Hello!";
            case "france" -> country + "：Bonjour!";
            case "korea" -> country + "：안녕하세요!";
            default -> "こんにちは！";
        };
    }
}
