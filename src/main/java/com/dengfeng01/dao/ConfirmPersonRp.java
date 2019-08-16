package com.dengfeng01.dao;

import com.dengfeng01.entity.ConfirmPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ConfirmPersonRp extends JpaRepository<ConfirmPerson,Integer> {


    @Query(value = "select name from confirm_person where project_inf_name=?1 and project_version=?2",nativeQuery = true)
    List<String> findNameByProjectInfNameAndProjectVersion(String projectInfName,String projectVersion);


}
