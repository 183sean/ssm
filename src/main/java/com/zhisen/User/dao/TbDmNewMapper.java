package com.zhisen.User.dao;

import com.zhisen.User.entity.TbDmNew;

public interface TbDmNewMapper {
    int deleteByPrimaryKey(String dmid);

    int insert(TbDmNew record);

    int insertSelective(TbDmNew record);

    TbDmNew selectByPrimaryKey(String dmid);

    int updateByPrimaryKeySelective(TbDmNew record);

    int updateByPrimaryKeyWithBLOBs(TbDmNew record);

    int updateByPrimaryKey(TbDmNew record);



    TbDmNew selectByPrimaryKey1();
}