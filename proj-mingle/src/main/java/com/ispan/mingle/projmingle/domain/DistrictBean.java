package com.ispan.mingle.projmingle.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "District")
public class DistrictBean {
    @Id
    @Column(name = "district", columnDefinition = "nvarchar", length = 5)
    private String district;
}
