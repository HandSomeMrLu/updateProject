package com.dengfeng01.controller;

import com.dengfeng01.entity.FrontInf;
import com.dengfeng01.service.FrontInfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FrontInfController {
    @Autowired
    FrontInfService frontInfService;

    @ResponseBody
    @RequestMapping("/insertFrontInf")
    public  String insertFrontInf(@RequestBody FrontInf frontInf)
    {
        frontInfService.save(frontInf);
        return "成功";
    }


}
