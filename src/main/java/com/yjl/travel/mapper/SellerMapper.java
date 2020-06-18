package com.yjl.travel.mapper;

import com.yjl.travel.model.Seller;


public interface SellerMapper {
    /**
     * 根绝sid查询出卖家
     * @param sid
     * @return
     */
    public Seller findSellerBySid(int sid);
}
