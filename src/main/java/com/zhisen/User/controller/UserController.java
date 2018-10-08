package com.zhisen.User.controller;

import com.alibaba.fastjson.JSONObject;
import com.zhisen.User.dao.TbDmNewMapper;
import com.zhisen.User.dao.TbUserMapper;
import com.zhisen.User.entity.TbDmNew;
import com.zhisen.User.entity.TbUser;
import com.zhisen.User.response.Response;
import com.zhisen.User.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;



@Slf4j
@Controller
@RequestMapping
public class UserController {

@RequestMapping(value = "/index", method = {RequestMethod.GET,RequestMethod.POST})
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
//注册页面
    @RequestMapping(value = "/regret", method = {RequestMethod.GET,RequestMethod.POST})
    public String toRegret(){
        return "regret";
    }
//注入UserMapper
    @Resource
    TbUserMapper tbUserMapper;
//注册验证
    @RequestMapping(value = "/register", method = {RequestMethod.GET,RequestMethod.POST}, consumes = "application/json")
    @ResponseBody
    public Response<TbUser> register(@RequestBody JSONObject jsonObject){
        Response<TbUser> tbUserResponse=null;
       TbUser tbUser = new TbUser();
       tbUser.setUsern(jsonObject.getString("username"));
       TbUser tbUser1 = tbUserMapper.findUserByName(jsonObject.getString("username"));
       if(tbUser1 != null){
           tbUserResponse = new Response<>(1000002, "用户名已被使用，请重新注册", tbUser);
       }else {
           tbUser.setUserp(jsonObject.getString("password"));
           tbUser.setSex(jsonObject.getString("sex"));
           tbUser.setEmail(jsonObject.getString("email"));
           tbUserMapper.insert(tbUser);
           tbUserResponse = new Response<>(200, "注册成功", tbUser);
       }

        return tbUserResponse;

    }

//注入Service
    @Autowired
    UserServiceImpl userService;
//登录页面
    @RequestMapping(value = "/login", method = {RequestMethod.GET,RequestMethod.POST})
    public String login() {
        return "login";
    }
//登录验证
    @RequestMapping(value = "/check", method = {RequestMethod.GET,RequestMethod.POST}, consumes = "application/json")
    @ResponseBody
    public Response<TbUser> LoginCheck(@RequestBody JSONObject jsonObject){
        TbUser tbUser = userService.login(jsonObject.getString("username"), jsonObject.getString("password"));
        Response<TbUser> tbUserResponse=null;
        if (tbUser==null){
             tbUserResponse = new Response<>(1000001, "用户名错误或者密码错误", tbUser);
        }else {
            tbUserResponse = new Response<>(200, "登录成功", tbUser);
        }
        return tbUserResponse;
    }


//注入TbDmNewMapper
    @Resource
    TbDmNewMapper tbDmNewMapper;
//dmnew
    @RequestMapping(value = "/indexDm", method = {RequestMethod.GET,RequestMethod.POST}, consumes = "application/json")
    @ResponseBody
    public TbDmNew indexDmm(){
//        Response<TbUser> tbUserResponse=null;
        TbDmNew tbDmNew= tbDmNewMapper.selectByPrimaryKey1();

        return tbDmNew;
    }

}
