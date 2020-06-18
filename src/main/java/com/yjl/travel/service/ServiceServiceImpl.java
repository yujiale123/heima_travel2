package com.yjl.travel.service;

import com.yjl.travel.dao.ServiceDao;
import com.yjl.travel.model.Service;

import java.util.List;


public class ServiceServiceImpl implements ServiceService {
    private ServiceDao dao = new ServiceDao();

    @Override
    public List<Service> findAll() {
        return dao.findAll();
    }

    @Override
    public Service findAnswerBySerid(int serid) {
        return dao.findAnswerBySerid(serid);
    }
}
