package com.dengfeng01.dao;

import com.dengfeng01.entity.UpdateMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UpdateMessageRp extends JpaRepository<UpdateMessage,Integer> {

    @Query(value = "select message from update_message where project_inf_name=?1 and project_version=?2",nativeQuery = true)
    List<String> findByProjectNameAndVersion(String projectName,String version);
}
