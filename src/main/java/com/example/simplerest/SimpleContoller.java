package com.example.simplerest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleContoller {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello WOrld";
    }

}
