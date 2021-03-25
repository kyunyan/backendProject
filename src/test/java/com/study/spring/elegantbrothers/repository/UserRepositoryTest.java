package com.study.spring.elegantbrothers.repository;

import com.study.spring.elegantbrothers.user.domain.User;
import com.study.spring.elegantbrothers.user.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud(){
        User USER = new User();
        USER.setUserNm("이건완");
        USER.setUserID("lee");
        USER.setUserAge(30);
        //user.setBirthday(LocalDate.of(1992,02,11));
        userRepository.save(USER);

        List<User> userList = userRepository.findAll();

        System.out.println("user : "+ userList);
    }

}