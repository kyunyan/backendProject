package com.study.spring.elegantbrothers.repository;

import com.study.spring.elegantbrothers.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


// jpa 를 상속받으면 crud 메소드들을 생성해준다.
public interface UserRepository extends JpaRepository<User, Long> {
}
