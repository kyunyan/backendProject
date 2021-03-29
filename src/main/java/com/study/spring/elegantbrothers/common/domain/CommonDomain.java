package com.study.spring.elegantbrothers.common.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) // 상속 전략
/*
*  CommonDomain PK를 외래키로 갖는 방식입니다.
    정규화가 된 모델링을 사용하기 때문에 데이터의 중복이 없으므로 가장 많이 사용되는 방법입니다.
* */
@DiscriminatorColumn(name="type")		// 구분 하는 칼럼
@NoArgsConstructor(access = AccessLevel.PUBLIC)         // 기본 생성자 생성

@Getter
public abstract class CommonDomain {
    @Id
    private String inputId;                     // 입력ID

    @Id
    private LocalDateTime inputDt;              // 입력 일시

    private String inputIp;                     // 입력IP

    private String updtId;                      // 수정ID

    private String updtIp;                      // 수정IP

    private LocalDateTime updtDt;               // 수정 일시


}
