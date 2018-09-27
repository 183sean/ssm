package com.zhisen.User.dao;

import com.zhisen.User.entity.TbYxNew;

public interface TbYxNewMapper {
    int deleteByPrimaryKey(String yxid);

    int insert(TbYxNew record);

    int insertSelective(TbYxNew record);

    TbYxNew selectByPrimaryKey(String yxid);

    int updateByPrimaryKeySelective(TbYxNew record);

    int updateByPrimaryKeyWithBLOBs(TbYxNew record);

    int updateByPrimaryKey(TbYxNew record);
}