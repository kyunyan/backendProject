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
@Table(name = "ORDER_MASTER")
public class OrderMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;                       // 주문 ID
    private String cstmrId;                     // 고객 ID
    private String goodsOrderRepr;              // 상품주문개수
    private String goodsPc;                     // 상품가격
    private String goodsName;                   // 상품이름
    private String goodsLike;                   // 상품좋아요
    private String goodsDc;                     // 상품설명
    private String inputId;                     // 입력ID
    private String inputIp;                     // 입력IP
    private LocalDateTime inputDt;              // 입력일시
    private String updtId;                      // 수정ID
    private String updtIp;                      // 수정IP
    private LocalDateTime updtDt;               // 수정일시

}
