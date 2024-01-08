package com.ispan.mingle.projmingle.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Volunteer")
public class VolunteerBean {
    @Id
    @Column(name = "userID", columnDefinition = "varchar", length = 100)
    private String userid;

    @Column(name = "password", columnDefinition = "varchar", length = 20)
    private String password;
}
