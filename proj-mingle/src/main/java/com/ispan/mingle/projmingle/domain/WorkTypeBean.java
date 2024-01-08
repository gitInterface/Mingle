package com.ispan.mingle.projmingle.domain;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="WorkType")
@Component
public class WorkTypeBean {
    

    /**  打工類型 */
    @Id
    @Column(name = "workType",
    columnDefinition = "nvarchar(10)")
    private String workType;

}
