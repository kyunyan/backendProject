package com.study.spring.elegantbrothers.user.controller;

import com.study.spring.elegantbrothers.user.domain.User;
import com.study.spring.elegantbrothers.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/findUserList")
    public List<User> findUserList(){
        return userService.findUserList();
    }

    @PostMapping("/insertUser")
    public void insertUser(){

    }

    @DeleteMapping("/deleteUser")
    public void deleteUser(){

    }
}
