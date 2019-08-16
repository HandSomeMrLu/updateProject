package com.dengfeng01.service;

import com.dengfeng01.entity.EndInf;

import java.util.List;

public interface EndInfService {



    List<EndInf> findByProjectNameAndVersion(String projectName,String version);
    void save(EndInf endInf);
}
