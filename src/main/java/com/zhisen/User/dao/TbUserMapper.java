package com.zhisen.User.dao;

import com.zhisen.User.entity.TbUser;
import org.apache.ibatis.annotations.Param;

public interface TbUserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    TbUser selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);

    //根据用户名和密码查询用户(简单的登录验证）
    //注解的两个参数会自动封装成map集合，括号内即为键
    TbUser findUserByNameAndPwd(@Param("name")String name, @Param("password")String password);
    TbUser findUserByName(@Param("name")String name);
}