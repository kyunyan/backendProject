package com.study.spring.elegantbrothers.repository;

import com.study.spring.elegantbrothers.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


// jpa 를 상속받으면 crud 메소드들을 생성해준다.
public interface UserRepository extends JpaRepository<User, Long> { //JpaRepository @Repository 를 자동으로 상속받게된다.
}
