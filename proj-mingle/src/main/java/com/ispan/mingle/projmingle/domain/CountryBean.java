package com.ispan.mingle.projmingle.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Country")
public class CountryBean {
    @Id
    @Column(name = "countryID", columnDefinition = "nvarchar", length = 15)
    private String countryid;
}
