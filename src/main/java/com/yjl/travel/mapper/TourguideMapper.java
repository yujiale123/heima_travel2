package com.yjl.travel.mapper;

import com.yjl.travel.model.Tourguide;

import java.util.List;


public interface TourguideMapper {
    /**
     *
     * @return
     */
    public List<Tourguide> findAll();

    public Tourguide findTourguideByid(int tid);
}
