package com.dengfeng01.service.serviceImp;

import com.dengfeng01.dao.ProjectInfRp;
import com.dengfeng01.entity.ProjectInf;
import com.dengfeng01.service.ProjectInfService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class ProjectInfServiceImp implements ProjectInfService {

    @Autowired
    ProjectInfRp projectInfRp;


    @Override
    public void saveProjectInf(ProjectInf projectInf) {
       projectInfRp.save(projectInf);
    }

    @Override
    public Page<ProjectInf> queryProjectInf(int currentPage, int pageSize) {
        return projectInfRp.findAll(PageRequest.of(currentPage,pageSize));
    }
}
