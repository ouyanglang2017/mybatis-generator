package com.startai.sp.dao;

import com.startai.sp.entity.Merchants;

public interface MerchantsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Merchants record);

    int insertSelective(Merchants record);

    Merchants selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Merchants record);

    int updateByPrimaryKeyWithBLOBs(Merchants record);

    int updateByPrimaryKey(Merchants record);
}