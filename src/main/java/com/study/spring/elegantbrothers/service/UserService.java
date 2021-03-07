package com.study.spring.elegantbrothers.service;

import com.study.spring.elegantbrothers.domain.User;
import com.study.spring.elegantbrothers.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> findUserList(){
        return userRepository.findAll();
    }


}
