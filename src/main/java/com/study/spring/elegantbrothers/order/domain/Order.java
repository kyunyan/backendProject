package com.study.spring.elegantbrothers.order.domain;

import com.study.spring.elegantbrothers.common.domain.CommonDomain;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor // 생성자
@AllArgsConstructor
@RequiredArgsConstructor        // 필요한 것을 필수로
@Table(name = "ORDER")
public class Order extends CommonDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ORDER_ID")
    private long orderId;                     // 주문ID

    @NonNull
    @Column(name="CSTMR_ID")
    private String cstmrId;                       // 고객ID

    @NonNull
    @Column(name="CSTMR_ID")
    private String goodsId;                     // 상품ID

    @Column(name="GOODS_ORDER_REPR")
    private int goodsOrderPepr;              // 상품주문개수

    @Column(name="GOODS_PC")
    private String goodsPc;                     // 상품가격

    @Column(name="GOODS_NAME")
    private String goodsName;                   // 상품이름

}
