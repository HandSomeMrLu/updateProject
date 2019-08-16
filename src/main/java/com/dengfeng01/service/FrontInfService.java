package com.dengfeng01.service;

import com.dengfeng01.entity.FrontInf;

import java.util.List;

public interface FrontInfService {


    List<FrontInf> findByProjectNameAndVersion(String projectName,String version);
    void save(FrontInf frontInf);
}
