package com.startai.sp.dao;

import com.startai.sp.entity.WechatRefundNotice;

public interface WechatRefundNoticeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WechatRefundNotice record);

    int insertSelective(WechatRefundNotice record);

    WechatRefundNotice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WechatRefundNotice record);

    int updateByPrimaryKey(WechatRefundNotice record);
}