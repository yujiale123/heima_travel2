package com.yjl.travel.mapper;

import org.apache.ibatis.annotations.Param;


public interface SerialMapper {

    boolean insertSerialOrder(@Param("serialId") String serialId,
                              @Param("oid") int oid,
                              @Param("rid") int rid,
                              @Param("payment") double payment,
                              @Param("payStype") String payStype,
                              @Param("peoCount") int peoCount,
                              @Param("uid") int uid);
}
