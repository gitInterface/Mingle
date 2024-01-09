package com.ispan.mingle.projmingle.domain;

import java.util.Date;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Payment")
@Component
public class PaymentBean {
    

    /** 綠界金流訂單編號 */
    @Id
    @Column(name = "paymentID" , 
    columnDefinition = "varchar(100)")
    private String paymentid;


    /** 訂單ID */
    @Column(name = "fk_orderID",
    columnDefinition = "int")
    private Integer orderid;


    /** 卡號後4碼 */
    @Column(name = "cardLast4",
    columnDefinition = "varchar(4)")
    private String cardLast4;
    

    /** 付款時間 */
    @Column(name = "paymentAt",
    columnDefinition = "datetime")
    private Date paymentAt;


    /** 是否付款 */
    @Column(name = "isPaymentRecieved", 
    columnDefinition = "bit")
    private Boolean isPaymentRecieved;


    /** 是否退款 */
    @Column(name = "isRefunded",
    columnDefinition = "bit")
    private Boolean isRefunded;


    /** 建立時間 */
    @Column(name = "createdAt",
    columnDefinition = "datetime")
    private Date createdAt;
    
    /** 更新時間 */
    @Column(name = "updatedAt",
    columnDefinition = "datetime")
    private Date updatedAt;

}
