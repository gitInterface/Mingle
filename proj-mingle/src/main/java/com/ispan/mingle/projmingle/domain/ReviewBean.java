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
@Table(name = "Review")
@Component
public class ReviewBean {
    

    /** 評價ID */
    @Id
    @Column(name = "reviewID", 
    columnDefinition = "int")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reviewid;


    /** 訂單ID */
    @Column(name = "fk_orderID",
    columnDefinition = "int")
    private Integer orderid;
    

    /** 評價內容 */
    @Column(name = "content",
    columnDefinition = "nvarchar(500)")
    private String content;


    /** 評價星數 */
    @Column(name = "stars",
    columnDefinition = "int")
    private Integer stars;


    /** 創建時間 */
    @Column(name = "createdAt",
    columnDefinition = "datetime")
    private Date createdAt;


    /** 更新時間 */
    @Column(name = "updatedAt",
    columnDefinition = "datetime")
    private Date updatedAt;


    /** 房東回覆內容 */
    @Column(name = "reply",
    columnDefinition = "nvarchar(500)")
    private String reply;


    /** 房東回覆時間 */
    @Column(name = "replyCreatedAt",
    columnDefinition = "datetime")
    private Date replyCreatedAt;

    
    /** 房東回覆更新時間 */
    @Column(name = "replyUpdatedAt",
    columnDefinition = "datetime")
    private Date replyUpdatedAt;

}
