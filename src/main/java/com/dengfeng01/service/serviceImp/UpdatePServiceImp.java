package com.dengfeng01.service.serviceImp;

import com.dengfeng01.dao.UpdatePersonRp;
import com.dengfeng01.entity.UpdatePerson;
import com.dengfeng01.service.UpdatePService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UpdatePServiceImp implements UpdatePService {
    @Autowired
    UpdatePersonRp updatePersonRp;

    @Override
    public List<String> findByProjectNameAndVersion(String name, String version) {
        return updatePersonRp.findByProjectNameAndVersion(name,version);
    }

    @Override
    public void save(UpdatePerson updatePerson) {
        updatePersonRp.save(updatePerson);
    }
}
