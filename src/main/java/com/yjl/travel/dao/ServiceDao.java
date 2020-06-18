package com.yjl.travel.dao;

import com.yjl.travel.mapper.ServiceMapper;
import com.yjl.travel.model.Service;
import com.yjl.travel.util.DButil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;


public class ServiceDao {

    /**
     *
     * @return
     */
    public List<Service> findAll(){
        List<Service> list = new ArrayList<>();
        SqlSession session = null;
        try {
            session = DButil.getSession();
            ServiceMapper mapper = session.getMapper(ServiceMapper.class);
            list = mapper.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DButil.closeSession(session);
        }
        return list;
    }

    /**
     *
     * @param serid
     * @return
     */
    public Service findAnswerBySerid(int serid){
        Service service = new Service();
        SqlSession session = null;
        try {
            session = DButil.getSession();
            ServiceMapper mapper = session.getMapper(ServiceMapper.class);
            service = mapper.findAnswerBySerid(serid);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DButil.closeSession(session);
        }
        return service;
    }
}
