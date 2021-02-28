package com.study.spring.elegantbrothers.repository;

import com.study.spring.elegantbrothers.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud(){
        User user = new User();
        user.setUserNm("이도검");
        user.setUserID("lee");
        user.setUserAge(30);
        user.setBirthday(LocalDate.of(1992,02,11));
        userRepository.save(user);

        List<User> userList = userRepository.findAll();

        System.out.println(userList);
    }

    @Test
    void allArgsConstructor(){
        User user = new User();
    }
}