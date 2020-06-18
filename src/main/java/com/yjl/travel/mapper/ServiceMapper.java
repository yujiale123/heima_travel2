package com.yjl.travel.mapper;

import com.yjl.travel.model.Service;

import java.util.List;


public interface ServiceMapper {
    /**
     * 找出全部问题
     * @return
     */
    public List<Service> findAll();

    /**
     * 依据id查出答案
     * @param serid
     * @return
     */
    public Service findAnswerBySerid(int serid);
}
