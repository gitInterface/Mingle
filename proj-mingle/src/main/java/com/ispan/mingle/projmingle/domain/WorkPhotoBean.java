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
@Table(name="Work_Photo")
@Component
public class WorkPhotoBean {


    /** 打工項目照片ID */
    @Id
    @Column(name = "photoID",
    columnDefinition = "int")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer photoid;


    /** 打工項目ID */
    @Column(name = "fk_workID",
    columnDefinition = "int")
    private Integer workid;

	
    /** 照片*/
    @Column(name = "photo",
    columnDefinition = "varbinary(3000)")
    private byte[] photo;


    /** 照片大小 */
    @Column(name = "photoSize",
    columnDefinition = "int")
    private Integer photoSize;


    /** 照片類型 */
    @Column(name = "contentType",
    columnDefinition = "varchar(20)")
    private String contentType;


    /** 照片建立時間 */
    @Column(name = "createdAt",
    columnDefinition = "datetime")
    private Date createdAt;

    
    /** 照片更新時間 */
    @Column(name = "updatedAt",
    columnDefinition = "datetime")
    private Date updatedAt;


    /** 是否刪除 */
    @Column(name = "isDeleted",
    columnDefinition = "bit")
    private Boolean isDeleted;

}
