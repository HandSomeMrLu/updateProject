package com.dengfeng01.service.serviceImp;

import com.dengfeng01.dao.EndInfRp;
import com.dengfeng01.entity.EndInf;
import com.dengfeng01.service.EndInfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EndInfServiceImp implements EndInfService {

    @Autowired
    EndInfRp endInfRp;

    @Override
    public List<EndInf> findByProjectNameAndVersion(String projectName, String version) {
        return endInfRp.findByProjectInfNameAndProjectVersion(projectName,version);
    }

    @Override
    public void save(EndInf endInf) {
        endInfRp.save(endInf);
    }
}
