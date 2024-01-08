package com.ispan.mingle.projmingle.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Comment")
public class CommentBean {

    @Id
    @Column(name = "commentID")
    private Integer commentID;

    @Column(name = "fk_userID", columnDefinition = "varchar", length = 100, nullable = false)
    private String fkUserID;

    @Column(name = "fk_articleID", columnDefinition = "int", nullable = false)
    private Integer fkArticleID;

    @Column(name = "content", columnDefinition = "nvarchar", length = 3000)
    private String content;

    @Column(name = "createdAt", columnDefinition = "datetime")
    private java.util.Date createdAt;

    @Column(name = "updatedAt", columnDefinition = "datetime")
    private java.util.Date updatedAt;

    @Column(name = "isDeleted")
    private Integer isDeleted;

}