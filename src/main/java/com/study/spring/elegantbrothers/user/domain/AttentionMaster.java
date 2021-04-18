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
@Table(name = "ATTENTION_MASTER")
public class AttentionMaster extends BaseEntity {
    @Id
    //@Column(name = "CSTMR_ID", length = 20, nullable = false)
    private String cstmrId;                       // 고객ID

    @Column(name = "GOODS_PC", length = 20)
    private String goodsPc;                     // 상품가격

    @Column(name = "GOODS_NAME", length = 50)
    private String goodsName;                   // 상품이름

    @Column(name = "GOODS_LIKE", length = 10)
    private int goodsLike;                      // 상품좋아요

    @Column(name = "GOODS_DC", length = 2000)
    private String goodsDc;                     // 상품 설명

    /**
     * fetch = FetchType.LAZY : Attention 조회 시, AttentionMaster들을 select 합니다.
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "CSTMR_ID")
    private List<Attention> attentions = new ArrayList<>();

    @Builder
    public AttentionMaster(String inputId, String inputIp, String updtId, String updtIp, String cstmrId, String goodsPc, String goodsName, int goodsLike, String goodsDc) {
        super(inputId, inputIp, updtId, updtIp);
        Assert.hasText(cstmrId, "cstmrId must not be empty");

        this.cstmrId = cstmrId;
        this.goodsPc = goodsPc;
        this.goodsName = goodsName;
        this.goodsLike = goodsLike;
        this.goodsDc = goodsDc;
    }
}
