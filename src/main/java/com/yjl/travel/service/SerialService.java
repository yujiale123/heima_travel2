package com.yjl.travel.service;



public interface SerialService {
    boolean insertSerialOrder(String serialId, int oid, int rid, double payment, String payStype, int peoCount, int uid);
}
