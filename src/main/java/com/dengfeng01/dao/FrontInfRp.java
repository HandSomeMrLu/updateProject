package com.dengfeng01.dao;

import com.dengfeng01.entity.FrontInf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FrontInfRp extends JpaRepository<FrontInf,Integer> {


    List<FrontInf> findByProjectInfNameAndProjectVersion(String projectName,String version);
}
