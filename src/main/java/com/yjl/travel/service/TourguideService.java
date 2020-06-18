package com.yjl.travel.service;

import com.yjl.travel.model.Tourguide;

import java.util.List;


public interface TourguideService {

     List<Tourguide> findAll();

     Tourguide findTourguideByid(int tid);
}
