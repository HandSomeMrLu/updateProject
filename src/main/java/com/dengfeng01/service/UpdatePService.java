package com.dengfeng01.service;

import com.dengfeng01.entity.UpdatePerson;

import java.util.List;

public interface UpdatePService {


    List<String> findByProjectNameAndVersion(String name,String version);
    void save(UpdatePerson updatePerson);
}
