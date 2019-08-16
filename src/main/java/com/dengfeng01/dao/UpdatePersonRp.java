package com.dengfeng01.dao;

import com.dengfeng01.entity.UpdatePerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UpdatePersonRp extends JpaRepository<UpdatePerson, String> {


    @Query(value = "select name from update_person where project_inf_name=?1 and project_version=?2",nativeQuery = true)
    List<String> findByProjectNameAndVersion(String projectName,String version);
}
