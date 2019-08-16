package com.dengfeng01.controller;

import com.dengfeng01.entity.EndInf;
import com.dengfeng01.service.EndInfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EndInfController {
    @Autowired
    EndInfService endInfService;

    @ResponseBody
    @RequestMapping("/insertEndInf")
    public String insertEndInf(@RequestBody EndInf endInf)
    {
        endInfService.save(endInf);
        return "成功";
    }



}
