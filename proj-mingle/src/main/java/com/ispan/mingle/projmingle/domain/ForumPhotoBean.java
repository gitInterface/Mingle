package com.ispan.mingle.projmingle.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Forum_Photo")
public class ForumPhotoBean {

    @Id
    @Column(name = "photoID")
    private Integer photoID;

    @Column(name = "fk_articleID", columnDefinition = "int")
    private Integer fkArticleID;

    @Column(name = "photo", columnDefinition = "varbinary", length = 3000)
    private byte[] photo;

    @Column(name = "contentType", columnDefinition = "varchar", length = 50)
    private String contentType;

    @Column(name = "createdAt", columnDefinition = "datetime")
    private java.util.Date createdAt;

    @Column(name = "updatedAt", columnDefinition = "datetime")
    private java.util.Date updatedAt;

    @Column(name = "isDeleted")
    private Integer isDeleted;
}
