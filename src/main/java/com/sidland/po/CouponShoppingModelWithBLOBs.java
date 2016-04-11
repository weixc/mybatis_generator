package com.sidland.po;

public class CouponShoppingModelWithBLOBs extends CouponShoppingModel {
    private String rangeVal;

    private String paysnCont;

    public String getRangeVal() {
        return rangeVal;
    }

    public void setRangeVal(String rangeVal) {
        this.rangeVal = rangeVal == null ? null : rangeVal.trim();
    }

    public String getPaysnCont() {
        return paysnCont;
    }

    public void setPaysnCont(String paysnCont) {
        this.paysnCont = paysnCont == null ? null : paysnCont.trim();
    }
}