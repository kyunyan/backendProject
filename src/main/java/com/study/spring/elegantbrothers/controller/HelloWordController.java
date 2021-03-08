package com.study.spring.elegantbrothers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @GetMapping(value ="/api/helloWorld")
    public String HelloWorld(){
        return "helloWorld";
    }



}
