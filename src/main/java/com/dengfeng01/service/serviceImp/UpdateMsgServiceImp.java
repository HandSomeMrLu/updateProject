package com.dengfeng01.service.serviceImp;

import com.dengfeng01.dao.UpdateMessageRp;
import com.dengfeng01.entity.UpdateMessage;
import com.dengfeng01.service.UpdateMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UpdateMsgServiceImp implements UpdateMsgService {
    @Autowired
    UpdateMessageRp updateMessageRp;
    @Override
    public List<String> findByProjectNameAndVersion(String projectName, String version) {
        return updateMessageRp.findByProjectNameAndVersion(projectName,version);
    }

    @Override
    public void save(UpdateMessage updateMessage) {
        updateMessageRp.save(updateMessage);
    }
}
