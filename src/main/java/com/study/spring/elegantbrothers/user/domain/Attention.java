package com.study.spring.elegantbrothers.user.domain;

import com.study.spring.elegantbrothers.common.domain.CommonDomain;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.util.Assert;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor // 생성자
@AllArgsConstructor
@Entity
@Table(name = "ATTENTION")
public class Attention extends CommonDomain {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "CSTMR_ID", length = 20, nullable = false)
    private String cstmrId;                       // 고객ID

    @Column(name = "GOODS_ID", length = 20, nullable = false)
    private long goodsId;                     // 상품ID

    @Column(name = "GOODS_PC", length = 20)
    private String goodsPc;                     // 상품가격

    @Column(name = "GOODS_NAME", length = 50)
    private String goodsName;                   // 상품이름

    /**
     * @JoinColumn(name = "GOODS_ID")은 연관 관계 객체의 id를 저장하는 컬럼 명을 의미합니다.
     * 해당 어노테이션은 생략이 가능합니다. 생략 시, 연관 관계 객체의 테이블명 + 연관 관계 객체의 테이블 PK명으로 만들어 집니다. (생략 시 GOODS_ID)
     * nullable이 true 라면 조회 시 left join을 이용합니다
     *
     */
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CSTMR_ID", nullable = true)
    private AttentionMaster attentionMaster;

    public Attention(String inputId, LocalDateTime inputDt, String inputIp, String updtId, String updtIp, LocalDateTime updtDt, String cstmrId, long goodsId, String goodsPc, String goodsName) {
        super(inputId, inputDt, inputIp, updtId, updtIp, updtDt);
        Assert.hasText(cstmrId, "cstmrId must not be empty");
        Assert.hasText(String.valueOf(goodsId), "goodsId must not be empty");

        this.cstmrId = cstmrId;
        this.goodsId = goodsId;
        this.goodsPc = goodsPc;
        this.goodsName = goodsName;
    }
}
