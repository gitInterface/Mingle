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
@Table(name = "Review_Photo")
@Component
public class ReviewPhotoBean {


    /** 評價照片ID */
    @Id
    @Column(name = "photoID", 
    columnDefinition = "int")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer photoid;


    /** 評價照片 */
    @Column (name = "photo",
    columnDefinition = "varbinary(3000)")
    private byte[] photo;


    /** 照片類型 */
    @Column(name = "contentType",
    columnDefinition = "varchar(50)")
    private String contentType;


    /** 創建時間 */
    @Column(name = "createdAt",
    columnDefinition = "datetime")
    private Date createdAt;


    /** 更新時間 */
    @Column(name = "updatedAt",
    columnDefinition = "datetime")
    private Date updatedAt;


    /** 是否刪除 */
    @Column(name = "isDeleted",
    columnDefinition = "bit")
    private Boolean isDeleted;

}
