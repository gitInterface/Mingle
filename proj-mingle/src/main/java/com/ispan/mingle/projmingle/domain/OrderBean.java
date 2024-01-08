package com.ispan.mingle.projmingle.domain;

import java.util.Date;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Order")
@Component
public class OrderBean 
{
    /** 訂單ID */
    @Id
    @Column(name = "orderID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderid;


    /** 會員ID */
    @Column(name = "fk_userID", columnDefinition = "varchar(100)")
    private String userid;


    /** 訂單狀態 */
    @Column(name = "status", columnDefinition = "varchar(20)")
    private String status;


    /** 備註 */
    @Column(name = "notes", columnDefinition = "nvarchar(100)")
    private String notes;


    /** 會員訂單需求備註 */
    @Column(name = "needs", columnDefinition = "nvarchar(255)")
    private String needs; 


    /** 訂單創建時間 */
    @Column(name = "createdAt", columnDefinition = "datetime")
    private Date createdAt;


    /** 訂單更新時間 */
    @Column(name = "updatedAt", columnDefinition = "datetime")
    private Date updatedAt;


    /** 訂單報名打工人數 */
    @Column(name = "numbers", columnDefinition = "int")
    private Integer numbers;


    /** 訂單開始日期 */
    @Column(name = "startDate", 
    columnDefinition = "datetime")
    private Date startDate;


    /** 訂單結束日期 */
    @Column (name = "endDate",
    columnDefinition = "datetime")
    private Date endDate;


    /** 是否取消 */
    @Column (name = "isCancelled",
    columnDefinition = "bit")
    private Boolean isCancelled;


    /** 是否退款*/
    @Column (name = "isRefunded",
    columnDefinition = "bit")
    private Boolean isRefunded;


    /** 是否為自己報名*/
    @Column (name = "isUserAttend",
    columnDefinition = "bit")
    private Boolean isUserAttend;   

    
    /** 統編 */
    @Column (name = "businessID", columnDefinition = "varchar(10)")
    private String businessId;


    /** 發票日期 */
    @Column (name = "invoiceDate", columnDefinition = "datetime")
    private Date invoiceDate;


    /** 發票號碼 */
    @Column (name = "invoiceNumber", columnDefinition = "varchar(20)")
    private String invoiceNumber;   

}
