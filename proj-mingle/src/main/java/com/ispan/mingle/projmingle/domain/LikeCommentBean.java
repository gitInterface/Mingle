package com.ispan.mingle.projmingle.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Like_Comment")
public class LikeCommentBean {

    @Id
    @Column(name = "fk_commentID")
    private Integer fkCommentID;

    @Column(name = "fk_userID", columnDefinition = "varchar", length = 100, nullable = false)
    private String fkUserID;

    @Column(name = "createdAt", columnDefinition = "datetime")
    private java.util.Date createdAt;

    @Column(name = "isDeleted")
    private Integer isDeleted;
}
