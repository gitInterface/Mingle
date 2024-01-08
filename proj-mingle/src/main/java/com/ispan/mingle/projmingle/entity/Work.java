package com.ispan.mingle.projmingle.entity;


import java.util.Date;
import java.io.Serializable;

/**
 * (Work)实体类
 *
 * @author makejava
 * @since 2024-01-08 17:05:37
 */
public class Work implements Serializable {
    private static final long serialVersionUID = -22009473032186661L;

    private Integer workid;

    private Integer fkLordid;

    private String fkWorktype;

    private String workname;

    private String status;

    private String notes;

    private String fkDistrict;

    private String address;

    private Date startdate;

    private Date enddate;

    private Integer numbers;

    private String description;

    private String worktime;

    private String vacation;

    private String agerestriction;

    private String genderrestriction;

    private String educationrestriction;

    private String experiencerestriction;

    private String languagerestriction;

    private String licenserestriction;

    private String benefits;

    private Date createdat;

    private Date updatedat;

    private String isdeleted;

    private String isonshelf;


    public void setWorkid(Integer workid) {
        this.workid = workid;
    }

    public void setFkLordid(Integer fkLordid) {
        this.fkLordid = fkLordid;
    }

    public void setFkWorktype(String fkWorktype) {
        this.fkWorktype = fkWorktype;
    }

    public void setWorkname(String workname) {
        this.workname = workname;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setFkDistrict(String fkDistrict) {
        this.fkDistrict = fkDistrict;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime;
    }

    public void setVacation(String vacation) {
        this.vacation = vacation;
    }

    public void setAgerestriction(String agerestriction) {
        this.agerestriction = agerestriction;
    }

    public void setGenderrestriction(String genderrestriction) {
        this.genderrestriction = genderrestriction;
    }

    public void setEducationrestriction(String educationrestriction) {
        this.educationrestriction = educationrestriction;
    }

    public void setExperiencerestriction(String experiencerestriction) {
        this.experiencerestriction = experiencerestriction;
    }

    public void setLanguagerestriction(String languagerestriction) {
        this.languagerestriction = languagerestriction;
    }

    public void setLicenserestriction(String licenserestriction) {
        this.licenserestriction = licenserestriction;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    public void setUpdatedat(Date updatedat) {
        this.updatedat = updatedat;
    }

    public void setIsdeleted(String isdeleted) {
        this.isdeleted = isdeleted;
    }

    public void setIsonshelf(String isonshelf) {
        this.isonshelf = isonshelf;
    }

}

