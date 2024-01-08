package com.ispan.mingle.projmingle.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Work")
public class WorkBean {


    @Id
    @Column(name = "workID")
    private Integer workid;
    [workID]

    @Column(name = "fk_lordID", columnDefinition = "int")
    private Integer fk_lordid;
    <fk_lordID, int,>

    @Column(name = "fk_workType", columnDefinition = "nvarchar(10)")
    private String fk_worktype;
    <fk_workType, nvarchar(10),>

    @Column(name = "workName", columnDefinition = "nvarchar(30)")
    private String workname;
    ,<workName, nvarchar(30),>

    @Column(name = "status", columnDefinition = "varchar(20)")
    private String status;
    ,<status, varchar(20),>



    ,<notes, nvarchar(100),>
           ,<fk_district, nvarchar(5),>
           ,<address, nvarchar(200),>
           ,<startDate, datetime,>
           ,<endDate, datetime,>
           ,<numbers, int,>
           ,<description, nvarchar(500),>
           ,<workTime, nvarchar(100),>
           ,<vacation, nvarchar(100),>
           ,<ageRestriction, nvarchar(100),>
           ,<genderRestriction, nvarchar(20),>
           ,<educationRestriction, nvarchar(100),>
           ,<experienceRestriction, nvarchar(100),>
           ,<languageRestriction, nvarchar(100),>
           ,<licenseRestriction, nvarchar(100),>
           ,<benefits, nvarchar(100),>
           ,<createdAt, datetime,>
           ,<updatedAt, datetime,>
           ,<isDeleted, bit,>
           ,<isOnShelf, bit,>)


}
