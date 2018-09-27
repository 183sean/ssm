package com.zhisen.User.dao;

import com.zhisen.User.entity.TbUserpinlun;

public interface TbUserpinlunMapper {
    int deleteByPrimaryKey(Integer plid);

    int insert(TbUserpinlun record);

    int insertSelective(TbUserpinlun record);

    TbUserpinlun selectByPrimaryKey(Integer plid);

    int updateByPrimaryKeySelective(TbUserpinlun record);

    int updateByPrimaryKey(TbUserpinlun record);
}