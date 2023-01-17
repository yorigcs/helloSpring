package com.hellostring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola")
public class HelloController {
    @GetMapping
    public String helloSpring() {
        return "Olá Spring";
    }

}
