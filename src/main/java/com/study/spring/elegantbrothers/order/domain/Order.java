package com.study.spring.elegantbrothers.order.domain;

import com.study.spring.elegantbrothers.common.domain.CommonDomain;
import com.study.spring.elegantbrothers.user.domain.AttentionMaster;
import lombok.*;
import org.springframework.util.Assert;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor // 생성자
@AllArgsConstructor
@Table(name = "ORDER")
public class Order extends CommonDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ID", length = 20, nullable = false ,unique = true)
    private long orderId;                     // 주문ID

    @Column(name="CSTMR_ID", length = 20, nullable = false)
    private String cstmrId;                       // 고객ID

    @Column(name="CSTMR_ID", length = 20, nullable = false)
    private long goodsId;                     // 상품ID

    @Column(name="GOODS_ORDER_REPR", length = 7)
    private int goodsOrderPepr;              // 상품주문개수

    @Column(name="GOODS_PC", length = 20)
    private String goodsPc;                     // 상품가격

    @Column(name="GOODS_NAME", length = 50)
    private String goodsName;                   // 상품이름

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ORDER_ID", nullable = true)
    private OrderMaster orderMaster;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ORDER_ID", nullable = true)
    private Payment payment;

    @Builder
    public Order(String inputId, LocalDateTime inputDt, String inputIp, String updtId, String updtIp, LocalDateTime updtDt, long orderId, String cstmrId, long goodsId, int goodsOrderPepr, String goodsPc, String goodsName) {
        super(inputId, inputDt, inputIp, updtId, updtIp, updtDt);
        Assert.hasText(String.valueOf(orderId), "orderId must not be empty");
        Assert.hasText(cstmrId, "cstmrId must not be empty");
        Assert.hasText(String.valueOf(goodsId), "goodsId must not be empty");

        this.orderId = orderId;
        this.cstmrId = cstmrId;
        this.goodsId = goodsId;
        this.goodsOrderPepr = goodsOrderPepr;
        this.goodsPc = goodsPc;
        this.goodsName = goodsName;
    }
}
