package com.example.HelloWorldSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldSpringController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
