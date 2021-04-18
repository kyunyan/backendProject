package com.study.spring.elegantbrothers.user.domain;

import com.study.spring.elegantbrothers.common.domain.BaseEntity;
import lombok.*;
import org.springframework.util.Assert;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor // 생성자
@AllArgsConstructor
@Entity
@Table(name = "SHOPPING_MASTER")
public class ShoppingMaster extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "GOODS_ID", length = 20, nullable = false)
    private long goodsId;                         // 상품ID

    @Column(name = "CSTMR_ID", length = 20, nullable = false)
    private String cstmrId;                       // 고객ID

    @Column(name = "GOODS_ORDER_REPR", length = 7)
    private int goodsOrderRepr;                   // 상품주문개수

    @Column(name = "GOODS_PC", length = 20)
    private String goodsPc;                        // 상품가격a

    @Column(name = "GOODS_NAME", length = 50)
    private String goodsName;                     // 상품 이름

    @Column(name = "GOODS_LIKE", length = 10)
    private int goodsLike;                        // 상품 좋아요

    @Column(name = "GOODS_DC", length = 2000, nullable = false)
    private String goodsDc;                     // 상품 설명

    /**
     * fetch = FetchType.LAZY : shopping 조회 시, shoppingMaster들을 select 합니다.
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "GOODS_ID")
    private List<Shopping> shopping = new ArrayList<>();

    @Builder
    public ShoppingMaster(String inputId, String inputIp, String updtId, String updtIp,  long goodsId, String cstmrId, int goodsOrderRepr, String goodsPc, String goodsName, int goodsLike, String goodsDc) {
        super(inputId, inputIp, updtId, updtIp);
        Assert.hasText(String.valueOf(goodsId), "goodsId must not be empty");
        Assert.hasText(cstmrId, "cstmrId must not be empty");
        this.goodsId = goodsId;
        this.cstmrId = cstmrId;
        this.goodsOrderRepr = goodsOrderRepr;
        this.goodsPc = goodsPc;
        this.goodsName = goodsName;
        this.goodsLike = goodsLike;
        this.goodsDc = goodsDc;
    }
}
