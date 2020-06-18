package com.yjl.travel.dao;

import com.yjl.travel.mapper.SellerMapper;
import com.yjl.travel.model.Seller;
import com.yjl.travel.util.DButil;
import org.apache.ibatis.session.SqlSession;


public class SellerDao {
    public Seller findSellerBySid(int sid){
        Seller sellerBySid = null;
        SqlSession session = null;
        try {
            session = DButil.getSession();
            SellerMapper mapper = session.getMapper(SellerMapper.class);
            sellerBySid = mapper.findSellerBySid(sid);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DButil.closeSession(session);
        }
        return sellerBySid;
    }
}
