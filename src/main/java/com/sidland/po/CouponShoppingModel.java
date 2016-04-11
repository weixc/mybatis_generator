package com.sidland.po;

public class CouponShoppingModel {
    private Integer id;

    private String actName;

    private Integer couponId;

    private Integer stime;

    private Integer etime;

    private Short actStatus;

    private Short rangeType;

    private Byte sendDim;

    private Byte paysnType;

    private Byte paysnCond;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName == null ? null : actName.trim();
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Integer getStime() {
        return stime;
    }

    public void setStime(Integer stime) {
        this.stime = stime;
    }

    public Integer getEtime() {
        return etime;
    }

    public void setEtime(Integer etime) {
        this.etime = etime;
    }

    public Short getActStatus() {
        return actStatus;
    }

    public void setActStatus(Short actStatus) {
        this.actStatus = actStatus;
    }

    public Short getRangeType() {
        return rangeType;
    }

    public void setRangeType(Short rangeType) {
        this.rangeType = rangeType;
    }

    public Byte getSendDim() {
        return sendDim;
    }

    public void setSendDim(Byte sendDim) {
        this.sendDim = sendDim;
    }

    public Byte getPaysnType() {
        return paysnType;
    }

    public void setPaysnType(Byte paysnType) {
        this.paysnType = paysnType;
    }

    public Byte getPaysnCond() {
        return paysnCond;
    }

    public void setPaysnCond(Byte paysnCond) {
        this.paysnCond = paysnCond;
    }
}