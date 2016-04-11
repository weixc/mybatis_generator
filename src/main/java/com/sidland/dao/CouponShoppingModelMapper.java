package com.sidland.dao;

import com.sidland.po.CouponShoppingModel;
import com.sidland.po.CouponShoppingModelWithBLOBs;

public interface CouponShoppingModelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CouponShoppingModelWithBLOBs record);

    int insertSelective(CouponShoppingModelWithBLOBs record);

    CouponShoppingModelWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CouponShoppingModelWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CouponShoppingModelWithBLOBs record);

    int updateByPrimaryKey(CouponShoppingModel record);
}