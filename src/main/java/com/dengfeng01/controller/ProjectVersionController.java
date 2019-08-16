package com.dengfeng01.controller;

import com.dengfeng01.entity.ProjectVersion;
import com.dengfeng01.entity.ProjectVersionInf;
import com.dengfeng01.entity.UpdateMessage;
import com.dengfeng01.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProjectVersionController {

    @Autowired
    ProjectVersionService projectVersionService;
    @Autowired
    ConfirmPService confirmPService;
    @Autowired
    UpdatePService updatePService;
    @Autowired
    EndInfService endInfService;
    @Autowired
    FrontInfService frontInfService;
    @Autowired
    UpdateMsgService updateMsgService;

    @ResponseBody
    @RequestMapping("/queryProjectVersion")
    public ProjectVersionInf queryProjectVersion(@RequestParam String projectName)
    {
        System.out.println(projectName);
        ProjectVersion projectVersion=projectVersionService.findNewestVersion(projectName);
        String version=projectVersion.getVersion();
        List<String> updatePersonNames=updatePService.findByProjectNameAndVersion(projectName,version);
        ProjectVersionInf projectVersionInf=new ProjectVersionInf();
        projectVersionInf.setName(projectName);
        projectVersionInf.setVersion(version);
        projectVersionInf.setDate(projectVersion.getTime());
        projectVersionInf.setUpdatePerson(updatePersonNames);
        projectVersionInf.setConfirmPerson(confirmPService.findNameByProjectNameAndVersion(projectName,version));
        projectVersionInf.setMessage(updateMsgService.findByProjectNameAndVersion(projectName,version));
        projectVersionInf.setEndInf(endInfService.findByProjectNameAndVersion(projectName,version));
        projectVersionInf.setFrontInf(frontInfService.findByProjectNameAndVersion(projectName,version));
        System.out.println(projectVersionInf);
        return  projectVersionInf;
    }
}
