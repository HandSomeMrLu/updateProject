package com.dengfeng01.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UpdateMessage {

    @Id
    private  int id;
    private  String message;

    private  String projectInfName;
    private String projectVersion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getProjectInfName() {
        return projectInfName;
    }

    public void setProjectInfName(String projectInfName) {
        this.projectInfName = projectInfName;
    }

    public String getProjectVersion() {
        return projectVersion;
    }

    public void setProjectVersion(String projectVersion) {
        this.projectVersion = projectVersion;
    }
}
