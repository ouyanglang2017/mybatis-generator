package com.startai.sp.entity;

import java.util.Date;

public class Orders {
    private Integer id;

    private String no;

    private String status;

    private Integer userId;

    private String powerBankId;

    private Date lentTime;

    private Integer lentMerchantId;

    private Date returnTime;

    private Integer returnMerchantId;

    private Integer deposit;

    private Integer fee;

    private String ips;

    private String remark;

    private Date createdAt;

    private Date updatedAt;

    private String userType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPowerBankId() {
        return powerBankId;
    }

    public void setPowerBankId(String powerBankId) {
        this.powerBankId = powerBankId == null ? null : powerBankId.trim();
    }

    public Date getLentTime() {
        return lentTime;
    }

    public void setLentTime(Date lentTime) {
        this.lentTime = lentTime;
    }

    public Integer getLentMerchantId() {
        return lentMerchantId;
    }

    public void setLentMerchantId(Integer lentMerchantId) {
        this.lentMerchantId = lentMerchantId;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public Integer getReturnMerchantId() {
        return returnMerchantId;
    }

    public void setReturnMerchantId(Integer returnMerchantId) {
        this.returnMerchantId = returnMerchantId;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips == null ? null : ips.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }
}