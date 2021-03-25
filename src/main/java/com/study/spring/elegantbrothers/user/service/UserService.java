package com.study.spring.elegantbrothers.user.service;

import com.study.spring.elegantbrothers.user.domain.User;
import com.study.spring.elegantbrothers.user.repository.UserRepository;
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
