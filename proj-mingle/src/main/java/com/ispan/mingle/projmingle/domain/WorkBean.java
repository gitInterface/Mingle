package com.ispan.mingle.projmingle.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

[workID]
      ,[fk_lordID]
      ,[fk_workType]
      ,[workName]
      ,[status]
      ,[notes]
      ,[fk_district]
      ,[address]
      ,[startDate]
      ,[endDate]
      ,[numbers]
      ,[description]
      ,[workTime]
      ,[vacation]
      ,[ageRestriction]
      ,[genderRestriction]
      ,[educationRestriction]
      ,[experienceRestriction]
      ,[languageRestriction]
      ,[licenseRestriction]
      ,[benefits]
      ,[createdAt]
      ,[updatedAt]
      ,[isDeleted]
      ,[isOnShelf]

@Entity
@Table(name = "Work")
public class WorkBean {

    private 
}
