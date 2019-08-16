package com.dengfeng01.service;

import com.dengfeng01.entity.ConfirmPerson;

import java.util.List;

public interface ConfirmPService {


    List<String> findNameByProjectNameAndVersion(String projectName,String version);
    void save(ConfirmPerson confirmPerson);
}
