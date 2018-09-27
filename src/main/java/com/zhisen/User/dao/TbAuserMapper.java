package com.zhisen.User.dao;

import com.zhisen.User.entity.TbAuser;

public interface TbAuserMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(TbAuser record);

    int insertSelective(TbAuser record);

    TbAuser selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(TbAuser record);

    int updateByPrimaryKey(TbAuser record);
}