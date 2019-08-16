package com.dengfeng01.entity;

import java.sql.Date;
import java.util.List;

public class ProjectVersionInf {

    private String name;
    private String version;
    private Date date;
    private List<String> updatePerson;
    private List<String> confirmPerson;
    private List<String> message;
    private List<FrontInf> frontInf;
    private List<EndInf> endInf;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<String> getUpdatePerson() {
        return updatePerson;
    }

    public void setUpdatePerson(List<String> updatePerson) {
        this.updatePerson = updatePerson;
    }

    public List<String> getConfirmPerson() {
        return confirmPerson;
    }

    public void setConfirmPerson(List<String> confirmPerson) {
        this.confirmPerson = confirmPerson;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    public List<FrontInf> getFrontInf() {
        return frontInf;
    }

    public void setFrontInf(List<FrontInf> frontInf) {
        this.frontInf = frontInf;
    }

    public List<EndInf> getEndInf() {
        return endInf;
    }

    public void setEndInf(List<EndInf> endInf) {
        this.endInf = endInf;
    }
}
