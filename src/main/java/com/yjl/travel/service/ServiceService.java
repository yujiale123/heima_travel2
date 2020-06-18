package com.yjl.travel.service;

import com.yjl.travel.model.Service;

import java.util.List;


public interface ServiceService {
    /**
     * 找出全部问题
     * @return
     */
     List<Service> findAll();

    /**
     * 依据id查出答案
     * @param serid
     * @return
     */
     Service findAnswerBySerid(int serid);
}
