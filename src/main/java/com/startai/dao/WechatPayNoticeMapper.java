package com.startai.dao;

import com.startai.model.WechatPayNotice;

public interface WechatPayNoticeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WechatPayNotice record);

    int insertSelective(WechatPayNotice record);

    WechatPayNotice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WechatPayNotice record);

    int updateByPrimaryKey(WechatPayNotice record);
}