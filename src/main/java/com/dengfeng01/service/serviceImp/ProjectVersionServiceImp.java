package com.dengfeng01.service.serviceImp;

import com.dengfeng01.dao.ProjectVersionRp;
import com.dengfeng01.entity.ProjectVersion;
import com.dengfeng01.service.ProjectVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProjectVersionServiceImp implements ProjectVersionService {

    @Autowired
    ProjectVersionRp projectVersionRp;

    @Override
    public ProjectVersion findNewestVersion(String projectName) {

         ProjectVersion projectVersion=projectVersionRp.findTopByProjectInfNameOrderByTimeAsc(projectName);
        return projectVersion;
    }

    @Override
    public void save(ProjectVersion projectVersion) {
        projectVersionRp.save(projectVersion);
    }
}
