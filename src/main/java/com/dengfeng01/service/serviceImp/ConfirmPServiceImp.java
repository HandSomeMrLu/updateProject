package com.dengfeng01.service.serviceImp;

import com.dengfeng01.dao.ConfirmPersonRp;
import com.dengfeng01.entity.ConfirmPerson;
import com.dengfeng01.service.ConfirmPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfirmPServiceImp implements ConfirmPService {

    @Autowired
    ConfirmPersonRp confirmPersonRp;

    @Override
    public List<String> findNameByProjectNameAndVersion(String projectName, String version) {
        return confirmPersonRp.findNameByProjectInfNameAndProjectVersion(projectName,version);
    }

    @Override
    public void save(ConfirmPerson confirmPerson) {
        confirmPersonRp.save(confirmPerson);
    }
}
