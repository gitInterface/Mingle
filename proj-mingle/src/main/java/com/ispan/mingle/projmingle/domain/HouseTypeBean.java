package com.ispan.mingle.projmingle.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "HouseType")
public class HouseTypeBean {
    @Id
    @Column(name = "houseType", columnDefinition = "nvarchar", length = 20)
    private String houseType;
}
