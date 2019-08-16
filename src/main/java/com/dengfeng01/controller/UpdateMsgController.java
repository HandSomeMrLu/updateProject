package com.dengfeng01.controller;

import com.dengfeng01.entity.UpdateMessage;
import com.dengfeng01.service.UpdateMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UpdateMsgController {
  @Autowired
    UpdateMsgService updateMsgService;
  @ResponseBody
  @RequestMapping("/insertUpdateMsg")
  public  String insertUpdateMsg(@RequestBody UpdateMessage updateMessage)
  {
      updateMsgService.save(updateMessage);
      return "成功";
  }


}
