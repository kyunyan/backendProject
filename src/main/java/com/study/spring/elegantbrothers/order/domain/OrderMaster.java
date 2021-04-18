package com.study.spring.elegantbrothers.order.domain;

import com.study.spring.elegantbrothers.common.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor // 생성자
@AllArgsConstructor
@Entity
@Table(name = "ORDER_MASTER", uniqueConstraints = {@UniqueConstraint(name="PK_ORDER_MASTER" , columnNames = {"ORDER_ID"})})
public class OrderMaster extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ID", length = 20)
    private long orderId;                       // 주문 ID

    @Column(name = "ORDER_ID", length = 20)
    private String cstmrId;                     // 고객 ID

    @Column(name = "GOODS_ORDER_REPR", length = 7)
    private int goodsOrderRepr;              // 상품주문개수

    @Column(name = "GOODS_PC", length = 20)
    private String goodsPc;                     // 상품가격

    @Column(name = "GOODS_NAME", length = 50)
    private String goodsName;                   // 상품이름

    @Column(name = "GOODS_LIKE", length = 10)
    private int goodsLike;                   // 상품좋아요

    @Column(name = "GOODS_DC", length = 2000)
    private String goodsDc;                     // 상품설명

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ORDER_ID")
    private List<Order> orders = new ArrayList<>();

    public OrderMaster(String inputId,  String inputIp, String updtId, String updtIp, long orderId, String cstmrId, int goodsOrderRepr, String goodsPc, String goodsName, int goodsLike, String goodsDc) {
        super(inputId, inputIp, updtId, updtIp);
        Assert.hasText(String.valueOf(orderId), "orderId must not be empty");
        this.orderId = orderId;
        this.cstmrId = cstmrId;
        this.goodsOrderRepr = goodsOrderRepr;
        this.goodsPc = goodsPc;
        this.goodsName = goodsName;
        this.goodsLike = goodsLike;
        this.goodsDc = goodsDc;
    }

}
