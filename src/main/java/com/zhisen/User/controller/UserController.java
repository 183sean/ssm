package com.zhisen.User.controller;

import com.alibaba.fastjson.JSONObject;
import com.zhisen.User.dao.TbUserMapper;
import com.zhisen.User.entity.TbUser;
import com.zhisen.User.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author Veng Su 1344114844@qq.com
 * @date 2018/5/12 8:40
 */
@Slf4j
@Controller
@RequestMapping
public class UserController {

@RequestMapping("/index")
public String toIndex(){
    return "index";
}

    @RequestMapping("/news")
    public String toNews(){
        return "news";
    }

//    @RequestMapping("/login")
//    public String toLogin(){
//        return "login";
//    }

    @RequestMapping("/regret")
    public String toRegret(){
        return "regret";
    }
//注入Service
    @Autowired
private UserServiceImpl userService = new UserServiceImpl();

    @RequestMapping(value = "/login", method = {RequestMethod.GET,RequestMethod.POST})
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/check", method = {RequestMethod.GET,RequestMethod.POST}, consumes = "application/json")
    @ResponseBody
    public TbUser LoginCheck(@RequestBody JSONObject jsonObject){
        TbUser tbUser = userService.login(jsonObject.getString("username"), jsonObject.getString("password"));
        return tbUser;
    }

}
