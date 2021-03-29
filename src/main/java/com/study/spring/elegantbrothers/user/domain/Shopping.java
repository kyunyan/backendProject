package com.study.spring.elegantbrothers.user.domain;

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
@Table(name = "SHOPPING")
public class Shopping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long goodsId;                         // 상품ID
    private String cstmrId;                       // 고객ID
    private int goodsOrderRepr;                   // 상품주문개수
    private String goodsPc;                        // 상품가격
    private String goodsName;                     // 상품 이름
    private String inputId;                     // 입력ID
    private String inputIp;                     // 입력IP
    private LocalDateTime inputDt;              // 입력 일시
    private String updtId;                      // 수정ID
    private String updtIp;                      // 수정IP
    private LocalDateTime updtDt;               // 수정 일시
}
