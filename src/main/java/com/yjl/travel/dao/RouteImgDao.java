package com.yjl.travel.dao;

import com.yjl.travel.mapper.RouteImgMapper;
import com.yjl.travel.model.RouteImg;
import com.yjl.travel.util.DButil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;


public class RouteImgDao {
    public List<RouteImg> findByrid(int rid){
        List<RouteImg> list = new ArrayList<>();
        SqlSession session = null;
        try {
            session = DButil.getSession();
            RouteImgMapper mapper = session.getMapper(RouteImgMapper.class);
            list = mapper.findByRid(rid);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DButil.closeSession(session);
        }
        return list;
    }
}
