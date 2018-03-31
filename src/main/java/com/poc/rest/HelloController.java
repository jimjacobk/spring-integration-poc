package com.poc.rest;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Greetings from Jim Jacob";
    }

}
