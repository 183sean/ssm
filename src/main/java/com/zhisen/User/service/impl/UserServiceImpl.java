package com.zhisen.User.service.impl;

import com.zhisen.User.dao.TbUserMapper;
import com.zhisen.User.entity.TbUser;
import com.zhisen.User.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;



@Service
public class UserServiceImpl implements UserService{

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser login(String name, String password) {
        // TODO Auto-generated method stub
        TbUser tbUser = tbUserMapper.findUserByNameAndPwd(name, password);
        return tbUser;
    }


}