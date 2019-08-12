package com.dengfeng01.service;

import com.dengfeng01.entity.ProjectInf;
import org.springframework.data.domain.Page;

public interface ProjectInfService {

    void saveProjectInf(ProjectInf projectInf);
    Page<ProjectInf> queryProjectInf(int currentPage,int pageSize);

}
