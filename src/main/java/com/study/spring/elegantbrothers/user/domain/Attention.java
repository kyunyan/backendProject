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
@Table(name = "ATTENTION")
public class Attention {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cstmrId;                       // 고객ID
    private String goodsOrderPepr;              // 상품주문개수
    private String goodsPc;                     // 상품가격
    private String goodsName;                   // 상품이름
    private String orderId;                     // 주문ID
    private String goodsId;                     // 상품ID
    private String inputId;                     // 입력ID
    private String inputIp;                     // 입력IP
    private LocalDateTime inputDt;              // 입력 일시
    private String updtId;                      // 수정ID
    private String updtIp;                      // 수정IP
    private LocalDateTime updtDt;               // 수정 일시

}