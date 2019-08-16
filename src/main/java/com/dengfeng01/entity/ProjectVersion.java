package com.dengfeng01.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.sql.Date;

@Entity
public class ProjectVersion {

    @Id
    private String version;
    private Date time;




    private  String projectInfName;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getProjectInfName() {
        return projectInfName;
    }

    public void setProjectInfName(String projectInfName) {
        this.projectInfName = projectInfName;
    }
}
