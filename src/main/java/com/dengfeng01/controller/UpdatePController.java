package com.dengfeng01.controller;

import com.dengfeng01.entity.UpdatePerson;
import com.dengfeng01.service.UpdatePService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UpdatePController {
  @Autowired
    UpdatePService updatePService;
  @ResponseBody
  @RequestMapping("/insertUpdateP")
  public String  insertUpdateP(@RequestBody UpdatePerson updatePerson)
  {
      updatePService.save(updatePerson);
      return "成功";
  }


}
