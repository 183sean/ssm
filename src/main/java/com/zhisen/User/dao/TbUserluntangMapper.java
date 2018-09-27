package com.zhisen.User.dao;

import com.zhisen.User.entity.TbUserluntang;

public interface TbUserluntangMapper {
    int deleteByPrimaryKey(String ltid);

    int insert(TbUserluntang record);

    int insertSelective(TbUserluntang record);

    TbUserluntang selectByPrimaryKey(String ltid);

    int updateByPrimaryKeySelective(TbUserluntang record);

    int updateByPrimaryKeyWithBLOBs(TbUserluntang record);

    int updateByPrimaryKey(TbUserluntang record);
}