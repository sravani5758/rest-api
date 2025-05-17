package com.example.restapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {

    @GetMapping("/Hello")
    public String message(){
        return  "Java-spring-boot";

    }

}
