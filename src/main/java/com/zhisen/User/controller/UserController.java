package com.zhisen.User.controller;

import com.zhisen.User.dao.TbUserMapper;
import com.zhisen.User.entity.TbUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author Veng Su 1344114844@qq.com
 * @date 2018/5/12 8:40
 */
@Slf4j
@Controller
public class UserController {

    @Resource
    TbUserMapper tbUserMapper;
    @RequestMapping("/hello")
    public String hello(){
//        log.error("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        return "index";
    }
    @RequestMapping("/find")
    @ResponseBody
    public String find(){
        TbUser tbUser=new TbUser();
        tbUser.setSex("nan");
        tbUserMapper.insert(tbUser);
        return "ok";
    }
}
