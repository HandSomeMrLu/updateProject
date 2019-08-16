package com.dengfeng01.dao;

import com.dengfeng01.entity.ProjectVersion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProjectVersionRp extends JpaRepository<ProjectVersion,String> {


     /* @Query(value = "select * from project_version where project_inf_name=?1",nativeQuery = true)*/
      ProjectVersion findTopByProjectInfNameOrderByTimeAsc(String projectName);
}
