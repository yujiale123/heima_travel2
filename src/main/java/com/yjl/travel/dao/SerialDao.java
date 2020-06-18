package com.yjl.travel.dao;

import com.yjl.travel.mapper.SerialMapper;
import com.yjl.travel.util.DButil;
import org.apache.ibatis.session.SqlSession;


public class SerialDao {
    public boolean insertSerialOrder(String serialId, int oid, int rid, double payment, String payStype, int peoCount,int uid){
        SqlSession session = null;
        boolean flag = false;
        try {
            session = DButil.getSession();
            SerialMapper mapper = session.getMapper(SerialMapper.class);
            flag = mapper.insertSerialOrder(serialId,oid, rid,payment,payStype,peoCount,uid);
            session.commit();
        } catch (Exception e) {
            session.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return flag;
    }
}
