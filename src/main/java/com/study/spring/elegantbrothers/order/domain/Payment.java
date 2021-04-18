package com.study.spring.elegantbrothers.order.domain;

import com.study.spring.elegantbrothers.common.domain.BaseEntity;
import lombok.*;
import org.springframework.util.Assert;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor // 생성자
//@AllArgsConstructor
@Entity
@Table(name = "PAYMENT", uniqueConstraints = {@UniqueConstraint(name="PK_PAYMENT" , columnNames = {"DLVR_SETLE_NO"})})
public class Payment extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DLVR_SETLE_NO", length = 20)
    private long dlvrSetleNo;       // 배달결제번호

    /*@ManyToOne
    @JoinColumn(name = "ORDER_ID") // 외래키
    private Order order;*/
    @Column(name = "ORDER_ID", length = 20, nullable = false)
    private long orderId;         // 주문ID

    @Column(name="GOODS_ID", length = 20, nullable = false)
    private long goodsId;                     // 상품ID

    @Column(name = "DLVR_ADRES", length = 150)
    private String dlvrAdres;       // 배달주소

    @Column(name = "DLVR_TLPHON_NO", length = 20)
    private String dlvrTlphonNo;    // 배달전화번호

    @Column(name = "DLVR_POST_NO", length = 20)
    private String dlvrPostNo;      // 배달우편번호

    @Column(name = "DLVR_DETAIL_ADRES", length = 150)
    private String dlvrDetailAdres; // 배달상세주소

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ORDER_ID")
    private List<Order> orders = new ArrayList<>();

    @Builder
    public Payment(long dlvrSetleNo, long orderId, String dlvrAdres, String dlvrTlphonNo, String dlvrPostNo, String dlvrDetailAdres, String inputId, String inputIp,  String updtId, String updtIp) {
        super(inputId, inputIp, updtId, updtIp);
        Assert.hasText(String.valueOf(dlvrSetleNo), "dlvrSetleNo must not be empty");
        Assert.hasText(String.valueOf(orderId), "orderId must not be empty");

        this.dlvrSetleNo = dlvrSetleNo;
        this.orderId = orderId;
        this.dlvrAdres = dlvrAdres;
        this.dlvrTlphonNo = dlvrTlphonNo;
        this.dlvrPostNo = dlvrPostNo;
        this.dlvrDetailAdres = dlvrDetailAdres;
    }
}


