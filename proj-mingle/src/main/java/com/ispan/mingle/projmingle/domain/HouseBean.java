package com.ispan.mingle.projmingle.domain;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "House")
public class HouseBean {
    @Id
    @Column(name = "houseID")
    private Integer houseid;

    @Column(name = "fk_lordID", columnDefinition = "int")
    private Integer lordid;

    @Column(name = "fk_houseType", columnDefinition = "nvarchar", length = 20)
    private String houseType;

    @Column(name = "fk_district", columnDefinition = "nvarchar", length = 5)
    private String district;

    @Column(name = "name", columnDefinition = "nvarchar", length = 50)
    private String name;

    @Column(name = "description", columnDefinition = "nvarchar", length = 1000)
    private String description;

    @Column(name = "address", columnDefinition = "nvarchar", length = 100)
    private String address;

    @Column(name = "postCode", columnDefinition = "varchar", length = 10)
    private String postCode;

    @Column(name = "beds", columnDefinition = "int")
    private Integer beds;

    @Column(name = "status", columnDefinition = "nvarchar", length = 20)
    private String status;

    @Column(name = "notes", columnDefinition = "nvarchar", length = 1000)
    private String notes;

    @Column(name = "hasWifi", columnDefinition = "bit")
    private Character hasWifi;

    @Column(name = "hasTV", columnDefinition = "bit")
    private Character hasTV;

    @Column(name = "hasKitchen", columnDefinition = "bit")
    private Character hasKitchen;

    @Column(name = "hasLaundry", columnDefinition = "bit")
    private Character hasLaundry;

    @Column(name = "hasParkingLot", columnDefinition = "bit")
    private Character hasParkingLot;

    @Column(name = "hasAirconditioner", columnDefinition = "bit")
    private Character hasAirconditioner;

    @Column(name = "hasPersonalSpace", columnDefinition = "bit")
    private Character hasPersonalSpace;

    @Column(name = "hasPool", columnDefinition = "bit")
    private Character hasPool;

    @Column(name = "hasGym", columnDefinition = "bit")
    private Character hasGym;

    @Column(name = "createdAt", columnDefinition = "datetime")
    private Date createdAt;

    @Column(name = "updatedAt", columnDefinition = "datetime")
    private Date updatedAt;

    @Column(name = "isDeleted", columnDefinition = "bit")
    private Character isDeleted;

}
