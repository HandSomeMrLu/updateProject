package com.dengfeng01.entity;

import javax.persistence.*;

@Entity
public class EndInf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String name;
    private  String address;
    private  String endVersion;
    private  int status;
    private  String projectInfName;
    private  String projectVersion;
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



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getEndVersion() {
        return endVersion;
    }

    public void setEndVersion(String endVersion) {
        this.endVersion = endVersion;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
