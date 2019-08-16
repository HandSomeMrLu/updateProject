package com.dengfeng01.service;

import com.dengfeng01.entity.UpdateMessage;

import java.util.List;

public interface UpdateMsgService {


    List<String> findByProjectNameAndVersion(String projectName,String version);
    void save(UpdateMessage updateMessage);
}
