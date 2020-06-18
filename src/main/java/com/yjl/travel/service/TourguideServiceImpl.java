package com.yjl.travel.service;

import com.yjl.travel.dao.TourguideDao;
import com.yjl.travel.model.Tourguide;

import java.util.List;


public class TourguideServiceImpl implements TourguideService {
    private TourguideDao dao = new TourguideDao();
    @Override
    public List<Tourguide> findAll() {
        return dao.findAll();
    }

    @Override
    public Tourguide findTourguideByid(int tid) {
        return dao.findTourguideByid(tid);
    }
}
