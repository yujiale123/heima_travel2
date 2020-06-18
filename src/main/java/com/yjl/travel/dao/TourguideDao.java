package com.yjl.travel.dao;

import com.yjl.travel.mapper.TourguideMapper;
import com.yjl.travel.model.Tourguide;
import com.yjl.travel.util.DButil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;


public class TourguideDao {

    public List<Tourguide> findAll(){
        List<Tourguide> list = new ArrayList<>();
        SqlSession session = null;

        try {
            session = DButil.getSession();
            TourguideMapper mapper = session.getMapper(TourguideMapper.class);
            list = mapper.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DButil.closeSession(session);
        }
        return list;
    }

    public Tourguide findTourguideByid(int tid){
        SqlSession session = null;
        Tourguide tourguide = null;
        try {
            session = DButil.getSession();
            TourguideMapper mapper = session.getMapper(TourguideMapper.class);
            tourguide = mapper.findTourguideByid(tid);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DButil.closeSession(session);
        }
        return tourguide;
    }
}
