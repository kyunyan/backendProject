package com.study.spring.elegantbrothers.domain;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor // 생성자
@AllArgsConstructor
@RequiredArgsConstructor        // 필요한 것을 필수로
//@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String userID;

    @NonNull
    private String userNm;

    private int userAge;
    private LocalDate birthday;
    private String phoneNumber;

}
