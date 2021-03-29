package com.study.spring.elegantbrothers.order.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor // 생성자
@AllArgsConstructor
@RequiredArgsConstructor        // 필요한 것을 필수로
@Entity
@Table(name = "PAYMENT")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long dlvrSetleNo;       // 배달결제번호
    private String orderId;         // 주문ID
    private String dlvrAdres;       // 배달주소
    private String dlvrTlphonNo;    // 배달전화번호
    private String dlvrPostNo;      // 배달우편번호
    private String dlvrDetailAdres; // 배달상세주소
    private String inputId;         // 입력ID
    private String inputIp;         // 입력IP
    private LocalDateTime inputDt;  // 입력일시
    private String updtId;          // 수정ID
    private String updtIp;          // 수정IP
    private LocalDateTime updtDt;   // 수정일시

}
