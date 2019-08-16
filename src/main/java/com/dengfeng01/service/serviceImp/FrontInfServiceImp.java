package com.dengfeng01.service.serviceImp;

import com.dengfeng01.dao.FrontInfRp;
import com.dengfeng01.entity.FrontInf;
import com.dengfeng01.service.FrontInfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FrontInfServiceImp implements FrontInfService {
    @Autowired
    FrontInfRp frontInfRp;

    @Override
    public List<FrontInf> findByProjectNameAndVersion(String projectName, String version) {
        return frontInfRp.findByProjectInfNameAndProjectVersion(projectName,version);
    }

    @Override
    public void save(FrontInf frontInf) {
        frontInfRp.save(frontInf);
    }
}
