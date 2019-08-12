package com.dengfeng01.controller;

import com.dengfeng01.entity.MyPage;
import com.dengfeng01.entity.ProjectInf;
import com.dengfeng01.service.ProjectInfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class projectInfController {

    @Autowired
    ProjectInfService projectInfService;

    @ResponseBody
    @RequestMapping("/addProjectInf")
    public String addProjectInf(@RequestBody ProjectInf projectInf)
    {
        System.out.println(projectInf.getBeginTime());
        projectInfService.saveProjectInf(projectInf);
        return "成功";
    }
    @ResponseBody
    @RequestMapping("/queryProjectInf")
    public Page<ProjectInf> queryProjectInf(@RequestBody MyPage page)
    {
        System.out.println("进入");
        return projectInfService.queryProjectInf(page.getCurrentPage(),page.getPageSize());
    }
}
