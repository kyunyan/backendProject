package com.study.spring.elegantbrothers.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Getter
//@Setter
//@ToString
@NoArgsConstructor // 생성자
@AllArgsConstructor
@RequiredArgsConstructor        // 필요한 것을 필수로
@Data       // getter , setter, toString
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;

    @NonNull
    @Column(name="USER_ID")
    private String userID;

    @NonNull
    @Column(name="USER_NM")
    private String userNm;

    @Column(name="USER_AGE")
    private int userAge;
    //private LocalDate birthday;
    //private String phoneNumber;

}
