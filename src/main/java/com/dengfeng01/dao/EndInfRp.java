package com.dengfeng01.dao;

import com.dengfeng01.entity.EndInf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EndInfRp extends JpaRepository<EndInf,Integer> {



    List<EndInf> findByProjectInfNameAndProjectVersion(String projectName,String version);
}
