package com.ispan.mingle.projmingle.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Forum")
public class ForumBean {

    @Id
    @Column(name = "articleID")
    private Integer articleID;

    @Column(name = "fk_userID", columnDefinition = "varchar", length = 100, nullable = false)
    private String fkUserID;

    @Column(name = "title", columnDefinition = "nvarchar", length = 50)
    private String title;

    @Column(name = "content", columnDefinition = "nvarchar", length = 3000)
    private String content;

    @Column(name = "views", columnDefinition = "int")
    private Integer views;

    @Column(name = "createdAt", columnDefinition = "datetime")
    private java.util.Date createdAt;

    @Column(name = "updatedAt", columnDefinition = "datetime")
    private java.util.Date updatedAt;

    @Column(name = "isDeleted")
    private Integer isDeleted;

    @Column(name = "fk_orderID", columnDefinition = "int")
    private Integer fk_orderID;
}
