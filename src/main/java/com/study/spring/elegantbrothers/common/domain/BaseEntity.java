package com.study.spring.elegantbrothers.common.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) // 상속 전략
/*
*  CommonDomain PK를 외래키로 갖는 방식입니다.
    정규화가 된 모델링을 사용하기 때문에 데이터의 중복이 없으므로 가장 많이 사용되는 방법입니다.
* */

@NoArgsConstructor(access = AccessLevel.PROTECTED)         // 기본 생성자 생성

@Getter
@MappedSuperclass
public class BaseEntity {
    @Id
    @Column(name = "INPUT_ID", length = 20, updatable = false)
    private String inputId;                     // 입력ID

    @Id
    @Column(name = "INPUT_DT", updatable = false)
    private LocalDateTime inputDt;              // 입력 일시

    @Column(name = "INPUT_IP", length = 20, updatable = false)
    private String inputIp;                     // 입력IP

    @Column(name = "UPDT_ID", length = 20)
    private String updtId;                      // 수정ID

    @Column(name = "UPDT_IP", length = 20)
    private String updtIp;                      // 수정IP

    @Column(name = "UPDT_DT")
    private LocalDateTime updtDt;               // 수정 일시

    @PrePersist
    public void prePersist(){
        LocalDateTime now = LocalDateTime.now();
        inputDt = now;
        updtDt = now;
    }

    /*
    * protected로 변경하면 new Member() 사용을 막을 수 있어 객체의 일관성을 더 유지할 수 있습니다.
    * */
    @Builder
    public BaseEntity(String inputId, String inputIp, String updtId, String updtIp){

        this.inputId = inputId;
        this.inputIp = inputIp;
        this.updtId = updtIp;
        this.updtId = updtId;
    }

}
