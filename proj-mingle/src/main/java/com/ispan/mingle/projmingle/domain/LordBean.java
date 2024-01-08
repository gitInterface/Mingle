package com.ispan.mingle.projmingle.domain;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Lord")
public class LordBean {
    @Id
    @Column(name = "lordID")
    private Integer lordid;

    @Column(name = "fk_userID", columnDefinition = "varchar", length = 100)
    private String userid;

    @Column(name = "fk_district", columnDefinition = "nvarchar", length = 5)
    private String district;

    @Column(name = "address", columnDefinition = "nvarchar", length = 50)
    private String address;

    @Column(name = "feature", columnDefinition = "nvarchar", length = 150)
    private String feature;

    @Column(name = "pet", columnDefinition = "nvarchar", length = 20)
    private String pet;

    @Column(name = "isPerfectLord", columnDefinition = "bit")
    private Character isPerfectLord;

    @Column(name = "createdAt", columnDefinition = "datetime")
    private Date createdAt;

    @Column(name = "updatedAt", columnDefinition = "datetime")
    private Date updatedAt;

}
