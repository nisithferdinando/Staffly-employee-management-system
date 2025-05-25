package com.ems.Staffly.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "ems_h_hr_details", schema = "ems_hr")
public class HrDetails {
    @Id
    @Column(name = "hr_id")
    private Long hrId;

    @Column(name = "hr_firstname")
    private String hrFirstName;

    @Column(name = "hr_lastname")
    private String hrLastName;

    @Column(name = "hr_email")
    private String hrEmail;

    @Column(name = "hr_password")
    private String hrPassword;

    @Column(name = "last_modified_date")
    private Date lastModifiedDate;

    @Column(name = "created_date")
    private Date createdDate;

    public HrDetails() {

    }
    public HrDetails(Long hrId, String hrFirstName, String hrLastName, String hrEmail,
                     String hrPassword, Date lastModifiedDate, Date createdDate) {
        this.hrId = hrId;
        this.hrFirstName = hrFirstName;
        this.hrLastName = hrLastName;
        this.hrEmail = hrEmail;
        this.hrPassword = hrPassword;
        this.lastModifiedDate = lastModifiedDate;
        this.createdDate = createdDate;
    }
    public Long getHrId() {
        return hrId;
    }

    public void setHrId(Long hrId) {
        this.hrId = hrId;
    }

    public String getHrFirstName() {
        return hrFirstName;
    }

    public void setHrFirstName(String hrFirstName) {
        this.hrFirstName = hrFirstName;
    }

    public String getHrLastName() {
        return hrLastName;
    }

    public void setHrLastName(String hrLastName) {
        this.hrLastName = hrLastName;
    }

    public String getHrEmail() {
        return hrEmail;
    }

    public void setHrEmail(String hrEmail) {
        this.hrEmail = hrEmail;
    }

    public String getHrPassword() {
        return hrPassword;
    }

    public void setHrPassword(String hrPassword) {
        this.hrPassword = hrPassword;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

}
