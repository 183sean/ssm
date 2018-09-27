package com.zhisen.User.service;

import com.zhisen.User.entity.TbUser;

/**
 * @author Veng Su 1344114844@qq.com
 * @date 2018/5/19 22:07
 */
public interface UserService {
    TbUser login(String name, String password);
}
