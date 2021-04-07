package com.example.demo.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class SimpleRestController {
    @GetMapping("/")
    String sayHello() {
        return "hello";
    }

}