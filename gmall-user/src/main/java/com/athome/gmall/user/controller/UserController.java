package com.athome.gmall.user.controller;


import com.athome.gmall.user.dao.UmsMember;
import com.athome.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
@ResponseBody
public class UserController {

    @Autowired
    private UserService userService;


    //获取所有用户信息
    @RequestMapping("getAllUser")
    @ResponseBody
    public  List<UmsMember> getAllUser(){

       List<UmsMember> umsMemberList =  userService.getAllUser();

        return umsMemberList;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index(){

        return "Hello World";
    }

}
