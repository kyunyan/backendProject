package com.study.spring.elegantbrothers.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HelloWordControllerTest {
    @Autowired
    private HelloWordController helloWordController;

    @Test
    void HellowWorld(){
       // System.out.println("test");
        System.out.println(helloWordController.HelloWorld());
    }
}