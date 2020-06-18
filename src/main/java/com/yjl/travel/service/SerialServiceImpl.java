package com.yjl.travel.service;

import com.yjl.travel.dao.SerialDao;


public class SerialServiceImpl implements SerialService {
    private SerialDao dao = new SerialDao();

    @Override
    public boolean insertSerialOrder(String serialId, int oid, int rid, double payment, String payStype, int peoCount,int uid) {

        return dao.insertSerialOrder(serialId,oid, rid,payment,payStype,peoCount,uid);
    }
}
