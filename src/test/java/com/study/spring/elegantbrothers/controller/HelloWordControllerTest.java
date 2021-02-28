package com.study.spring.elegantbrothers.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HelloWordControllerTest {
    @Autowired
    private HelloWordController helloWordController;

    private MockMvc mockMvc;

    @Test
    void HellowWorld(){
//        System.out.println("test");
        System.out.println(helloWordController.HelloWorld());
    }

    @Test
    void mockMvcTest() throws Exception {
        // http 를 이용해서 테스트를 진행할수 있도록 한다.
        mockMvc = MockMvcBuilders.standaloneSetup(helloWordController).build();

        mockMvc.perform(
                MockMvcRequestBuilders.get("/api/helloWorld")       // http get 메소드를 이용해서 호출한다.
        ).andDo(MockMvcResultHandlers.print())                                 // request, response 정보에 따라 저곰더 자세하게 나온다
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.content().string("helloWorld"));       // response 에 내용이 helloWolrd인지 확인한다.
    }
}