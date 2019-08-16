package com.dengfeng01.controller;

import com.dengfeng01.entity.ConfirmPerson;
import com.dengfeng01.service.ConfirmPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConfirmPController {

     @Autowired
    ConfirmPService confirmPService;

     @ResponseBody
     @RequestMapping("/insertConfirmP")
    public String insertConfirmP(@RequestBody ConfirmPerson confirmPerson)
    {
        confirmPService.save(confirmPerson);
        return "成功";
    }
}
