package com.dengfeng01.service;

import com.dengfeng01.entity.ProjectVersion;

public interface ProjectVersionService {



    ProjectVersion findNewestVersion(String projectName);
    void save(ProjectVersion projectVersion);
}
